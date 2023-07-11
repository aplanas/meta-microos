SUMMARY = "Backports of the traceback module"
DESCRIPTION = "A backport of traceback to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.4.0"

RPM_NAME = "python310-traceback2-1.4.0-7.3.noarch.rpm"
RPM_HASH = "487441faf9490d56da8cc4f772ad1b16d037702db9cec34b6daaa2108b288b788886d607d96eab6b4e16932c88b2bf57ac060bf9e0c894fc96d7f17c730871a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-traceback2 \
python310-traceback2 \
python3dist-traceback2"

RDEPENDS:${PN} += "python-abi \
python310-linecache2 \
python310-pbr"

inherit rpm
