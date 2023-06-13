SUMMARY = "Development files for spindle"
DESCRIPTION = "Spindle is a tool for improving the performance of dynamic library \
and python loading in HPC environments. \
 \
This package contains the development files for spindle."
LICENSE = "LGPL-2.1-only"

PV = "0.12.git.4815692"

RPM_NAME = "spindle-devel-0.12.git.4815692-1.11.aarch64.rpm"
RPM_HASH = "9f87bb96347ab87c8d608f722fe9494f438e256cc9e54b9f8be2627f7e2511a511cada54b5ca203e94555471e38b6bfb6a1c64d9b1487cbb2f5b23b5e18076cd"

RPROVIDES:${PN} += "spindle-devel \
spindle-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
