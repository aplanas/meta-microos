SUMMARY = "Development package for deepin-polkit-agent"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.21"

RPM_NAME = "deepin-polkit-agent-devel-5.5.21-1.2.aarch64.rpm"
RPM_HASH = "18c7f2b4db44b48a0f1cbf3a7386d05cbeb3b089e22834c8939405ce4004ee64718e2f609fd6247fdce62cd38c759fee3973a03bf7e22bb25ca67f99f89f91cb"

RPROVIDES:${PN} += "deepin-polkit-agent-devel \
deepin-polkit-agent-devel(aarch-64)"
RDEPENDS:${PN} += "deepin-polkit-agent"

inherit rpm
