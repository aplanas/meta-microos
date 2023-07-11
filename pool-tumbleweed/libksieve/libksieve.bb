SUMMARY = "Sieve and Managesieve support library for KDE PIM applications"
DESCRIPTION = "This package contains the libksieve library, which is used to support \
the Sieve server-side mail filtering protocol in KDE PIM applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libksieve-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c460f872246ee84590457b58fdf66948af8f88aa5f01d03af0469516586d4af57a5509b19dc14e1a390c54fd1310dfc889abe4c2d3b56acd4403d321875c5a4d"

RPROVIDES:${PN} += "libksieve"

RDEPENDS:${PN} += ""

inherit rpm
