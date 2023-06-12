SUMMARY = "Header files for the REXX interpreter"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require Regina-REXX."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "Regina-REXX-devel-3.9.1-6.9.aarch64.rpm"
RPM_HASH = "ee67ecba6e6358b3b2e587fb4317eb61e661219d5d2a82d4269f5df6cb9ff80958ac0b8eebfaa673138781de5491b657f05bd209e062df99e1d98f753aeb3dc6"

RPROVIDES:${PN} += "Regina-REXX-devel \
Regina-REXX-devel(aarch-64) \
regina-devel \
regina:/usr/include/rexxsaa.h"
RDEPENDS:${PN} += "/bin/sh \
Regina-REXX \
libregina3"

inherit rpm
