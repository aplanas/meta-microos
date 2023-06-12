SUMMARY = "ASM support for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (ASM support)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-classgen-2.1.1-1.1.noarch.rpm"
RPM_HASH = "4161339fd48079836e60aaed34fc8d1797eeac1e9f8c5985f0af259286714852abe77b6c2ec600f870209dc1fe884eb132d2bc6ff03b2929ba6b8dddc09fc4d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-classgen"
RDEPENDS:${PN} += ""

inherit rpm
