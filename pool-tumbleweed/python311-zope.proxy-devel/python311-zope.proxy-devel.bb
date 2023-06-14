SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "This package contains the files needed for binding the python311-zope.proxy C module."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python311-zope.proxy-devel-4.6.1-1.4.aarch64.rpm"
RPM_HASH = "a97bb002b9d5205e63178573afeb96c6a53ed151b337c0a2e0993dc4321473184cd18fd8adea72bd98b27bd26f24bfc1b57efc669bbe19ab1c3838f89ccd3392"

RPROVIDES:${PN} += "python311-zope-proxy \
python311-zope.proxy-devel"

RDEPENDS:${PN} += "python311-zope.proxy"

inherit rpm
