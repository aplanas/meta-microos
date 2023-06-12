SUMMARY = "BSF support for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (BSF support)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-bsf-2.1.1-1.1.noarch.rpm"
RPM_HASH = "e37821e2a9c7a9c90ccd8e569496ec6fbbb8e1511bf0b088c0e96e46d0a87e26190d1acd74bb6db8a96043297de5e38fcfec77e214e0a63db922d9a69e82a786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-bsf"
RDEPENDS:${PN} += "bsf"

inherit rpm
