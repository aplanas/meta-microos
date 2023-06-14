SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "This package contains the files needed for binding the python310-zope.proxy C module."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python310-zope.proxy-devel-4.6.1-1.4.aarch64.rpm"
RPM_HASH = "3cefa1095ad2461d8eb0fce048599673f975234a06f43de669c488bfc1e3db325092330d3e84a0e94e987774594bf4915ca0574f75daaf87865b1167e50a3331"

RPROVIDES:${PN} += "python3-zope-proxy \
python3-zope.proxy-devel \
python310-zope-proxy \
python310-zope.proxy-devel"

RDEPENDS:${PN} += "python310-zope.proxy"

inherit rpm
