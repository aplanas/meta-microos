SUMMARY = "Development files for spindle"
DESCRIPTION = "Spindle is a tool for improving the performance of dynamic library \
and python loading in HPC environments. \
 \
This package contains the development files for spindle."
LICENSE = "LGPL-2.1-only"

PV = "0.12.git.4815692"

RPM_NAME = "spindle-devel-0.12.git.4815692-1.12.aarch64.rpm"
RPM_HASH = "243dc678aac98a782e4fda34466c9d868fb1cb082c22f58e2f12fe86f1eabd8b3330994c4da814a1f9ccdde816af98c731058ffa2aa7c050411b05e7a63b77c3"

RPROVIDES:${PN} += "spindle-devel"

RDEPENDS:${PN} += ""

inherit rpm
