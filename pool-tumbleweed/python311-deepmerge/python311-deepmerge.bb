SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-deepmerge-1.1.0-1.3.noarch.rpm"
RPM_HASH = "8f9e9ffbdd6fc2116eec21480f1f256cd91704a019eccf3cbfdc4e5cb8f4b337e38a3dde236e5aca00cd928cae4f1dac840e383846e4ddf9d5b25629bb60f8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deepmerge \
python3.11dist-deepmerge \
python311-deepmerge \
python3dist-deepmerge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
