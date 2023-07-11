SUMMARY = "Includes static libraries for the ipmiutil package"
DESCRIPTION = "The ipmiutil-static package contains static libraries which are \
useful for building custom IPMI applications."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "ipmiutil-static-3.1.8-1.5.aarch64.rpm"
RPM_HASH = "6030bf3f07727e39fb0ae9ca0bb26504c52d3342f70384c464661062b66f63962e6619cf537fb2674521b9facbad9cb6b73ee3153e8c32db469214cb908c8d51"

RPROVIDES:${PN} += "ipmiutil-static"

RDEPENDS:${PN} += "ipmiutil"

inherit rpm
