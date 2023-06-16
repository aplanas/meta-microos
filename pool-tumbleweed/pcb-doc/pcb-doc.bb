SUMMARY = "Documentation for PCB, An interactive printed circuit board editor"
DESCRIPTION = "This package contains the documentation of PCB, an interactive printed circuit \
board editor."
LICENSE = "GPL-2.0-only"

PV = "4.3.0"

RPM_NAME = "pcb-doc-4.3.0-1.10.noarch.rpm"
RPM_HASH = "f3c108d6b213dd8a93d5e8fa0506ba58f23bd156df0106480625a5a72c685597ab76433bd55d12543fa01357c85255fd1b4e718d9ffd62f8f106eb90c4734470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcb-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
