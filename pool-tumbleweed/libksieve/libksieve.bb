SUMMARY = "Sieve and Managesieve support library for KDE PIM applications"
DESCRIPTION = "This package contains the libksieve library, which is used to support \
the Sieve server-side mail filtering protocol in KDE PIM applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libksieve-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "abd10fd0759dd04f86bf2f4fed3aefb1983aa3c465848c9d5e0b1643f0c485784f87e58af325bc021d9d6fe33131b8298d329d64d7c3c4ecd103c26f9ded368d"

RPROVIDES:${PN} += "libksieve"

RDEPENDS:${PN} += ""

inherit rpm
