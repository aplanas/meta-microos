SUMMARY = "Iosevka in monospace, Andale Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS01 typeface (monospace, Andale Mono style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss01-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "3bff8d737435032e11411ed3e796088fd6feabf2bfb2349842dbace1a32a5b5f01a89ca44eb6dc1617e0b6d048088a0dc903d5aaf8f374267fb4d27e88e539bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss01-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
