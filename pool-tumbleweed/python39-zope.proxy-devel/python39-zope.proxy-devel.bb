SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "This package contains the files needed for binding the python39-zope.proxy C module."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python39-zope.proxy-devel-4.6.1-2.3.aarch64.rpm"
RPM_HASH = "66a118de658342c37bb10b266975afa8a37722e03762b335b55ce2594cfaf0feabd05c903d4f088b9cf93f66c17f188f8fd05e4c3694ac7618ae2d80dc57e639"

RPROVIDES:${PN} += "python39-zope-proxy \
python39-zope.proxy-devel"

RDEPENDS:${PN} += "python39-zope.proxy"

inherit rpm
