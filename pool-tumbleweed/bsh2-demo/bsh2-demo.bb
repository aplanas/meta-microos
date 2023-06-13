SUMMARY = "Demonstrations and samples for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (demo and samples)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-demo-2.1.1-1.1.noarch.rpm"
RPM_HASH = "903c3d67358950fe3ce831713ffe83cd021d4773fb314a5101dd45901c13f40b321b52d56777b554e365e93a16ab6f63f6e26c79641ccd874a9d8d0d994cda27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-demo"

RDEPENDS:${PN} += "bsh2"

inherit rpm
