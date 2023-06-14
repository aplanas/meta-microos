SUMMARY = "Indexing Package Properties"
DESCRIPTION = "The scout tool helps with indexing of various package properties."
LICENSE = "MIT"

PV = "0.2.7+20230124.b4e3468"

RPM_NAME = "scout-0.2.7+20230124.b4e3468-1.1.noarch.rpm"
RPM_HASH = "7130510337b21cb6cb177e9a789d8310732de92812ca97c66cbd37a782c49aa925b8f7a59dac1d733f301ea9aec0d24219c312f8d295982756915de2b9eccd0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-scout \
scout"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-solv \
python3-xml"

inherit rpm
