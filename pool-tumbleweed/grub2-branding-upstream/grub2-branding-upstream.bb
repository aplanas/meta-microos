SUMMARY = "Upstream branding for GRUB2's graphical console"
DESCRIPTION = "Upstream branding for GRUB2's graphical console"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-branding-upstream-2.12~rc1-2.1.aarch64.rpm"
RPM_HASH = "aaab67f2868a1d2406a30ea5b822ec246af2f0e19f2607fef724a706906978bbf0b1e3b3f634c69488b8b35064b05185bbd06f988c6b1a22a4511b1571608c09"

RPROVIDES:${PN} += "grub2-branding-upstream"

RDEPENDS:${PN} += "grub2"

inherit rpm
