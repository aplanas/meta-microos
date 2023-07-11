SUMMARY = "Indexing Package Properties"
DESCRIPTION = "The scout tool helps with indexing of various package properties."
LICENSE = "MIT"

PV = "0.2.7+20230124.b4e3468"

RPM_NAME = "scout-0.2.7+20230124.b4e3468-1.2.noarch.rpm"
RPM_HASH = "5d43fec9fb57b1252cff17234b62525284e739b072952334c6d83e73e477261562f64c545199b11a5408107c9925c52bdcb162ed2f5f449aab1f581129566527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-scout \
scout"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-solv \
python3-xml"

inherit rpm
