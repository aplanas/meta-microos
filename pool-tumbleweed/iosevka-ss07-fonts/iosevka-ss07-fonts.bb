SUMMARY = "Iosevka in monospace, Monaco style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS07 typeface (monospace, Monaco style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss07-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "703a7f0b418f1f5fa599fe2ef785fcb2ecde4cf3acfe33fdf0ec8e7d7413f9faddb3b8a93b3755a2a7275bf6408fd50e9a2a07073d8f263b3f19cd9c136089c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss07-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
