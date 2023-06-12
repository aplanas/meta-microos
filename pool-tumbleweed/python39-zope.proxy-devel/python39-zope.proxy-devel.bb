SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "This package contains the files needed for binding the python39-zope.proxy C module."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python39-zope.proxy-devel-4.6.1-1.4.aarch64.rpm"
RPM_HASH = "479f9c22f5747bf9a6a8f93a679f7e6d3f4e92d11b6f213293941084543bc11e71918bfb3a3b1663cacfce89136bf5c5bc00195afb23c4a9a1aa11952460ebdb"

RPROVIDES:${PN} += "python39-zope-proxy \
python39-zope.proxy-devel \
python39-zope.proxy-devel(aarch-64)"
RDEPENDS:${PN} += "python39-zope.proxy"

inherit rpm
