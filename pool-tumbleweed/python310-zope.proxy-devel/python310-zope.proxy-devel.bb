SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "This package contains the files needed for binding the python310-zope.proxy C module."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python310-zope.proxy-devel-4.6.1-2.3.aarch64.rpm"
RPM_HASH = "0a661878c8bf46223f39d49d7752298f6a10d5b0c05431216fde03d10ca603024bb3d224aff96d70ba9d54eaba63295d6c51338b24485ea09528f666b947a6d4"

RPROVIDES:${PN} += "python310-zope-proxy \
python310-zope.proxy-devel"

RDEPENDS:${PN} += "python310-zope.proxy"

inherit rpm
