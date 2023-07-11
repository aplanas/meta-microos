SUMMARY = "ASDF schemas for transforms"
DESCRIPTION = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-asdf-transform-schemas-0.3.0-1.5.noarch.rpm"
RPM_HASH = "023d75cf15b5bf980c9c51fe4fc2e4e01ee20bdefd356e630c3e28f0b1f20e68833b4638923acd22a712243e945efcc035f9ce48c4e6f1c7fffa3a01304f8231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-transform-schemas \
python3.11dist-asdf-transform-schemas \
python311-asdf-transform-schemas \
python3dist-asdf-transform-schemas"

RDEPENDS:${PN} += "python-abi \
python311-asdf-standard"

inherit rpm
