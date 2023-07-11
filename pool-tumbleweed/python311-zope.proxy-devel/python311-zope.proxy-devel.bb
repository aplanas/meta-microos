SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "This package contains the files needed for binding the python311-zope.proxy C module."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python311-zope.proxy-devel-4.6.1-2.3.aarch64.rpm"
RPM_HASH = "0dceb0cdaadc5a5f622b000c5c1bcc65eb617b53356f0a5ff5257692721e8c1de7bb06b99beaf04934e341644310d2f609b9c44e227e5cea5578492d089372b3"

RPROVIDES:${PN} += "python3-zope-proxy \
python3-zope.proxy-devel \
python311-zope-proxy \
python311-zope.proxy-devel"

RDEPENDS:${PN} += "python311-zope.proxy"

inherit rpm
