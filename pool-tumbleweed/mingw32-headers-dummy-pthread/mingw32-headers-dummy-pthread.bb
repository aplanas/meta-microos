SUMMARY = "Stub pthread header files for MinGW"
DESCRIPTION = "This subpackage contains stub pthread header files that are empty \
and only exist to satisfy dependencies in MinGW's unistd.h until \
an actual pthread implementation (like winpthreads) is installed."
LICENSE = "SUSE-Public-Domain"

PV = "10.0.0"

RPM_NAME = "mingw32-headers-dummy-pthread-10.0.0-1.3.noarch.rpm"
RPM_HASH = "ae728c695b5f2b04167df051048ceb6dffebabc4052b14ff16e2604f52129640329f661cc722c290e0661ee3980635b899069ae485fedd12888f365271918af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-headers-dummy-pthread \
mingw32-unistd-pthread-devel"

RDEPENDS:${PN} += ""

inherit rpm
