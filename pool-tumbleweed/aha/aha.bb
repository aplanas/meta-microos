SUMMARY = "ANSI color to HTML converter"
DESCRIPTION = "aha (ANSI HTML Adapter) converts ANSI colors to HTML, e.g. if you \
want to publish the output of ls --color=yes, git diff, ccal or htop \
as static HTML somewhere."
LICENSE = "MPL-1.1 | LGPL-2.1-or-later"

PV = "0.5.1"

RPM_NAME = "aha-0.5.1-1.12.aarch64.rpm"
RPM_HASH = "14bcc02a8db7a8f3495d3eef5404d7ff0b90d172d4ada71be17e45648763a0de115001db497a6064ec51594265fe6b79e7d279cc4ba7d3f62716f002e6829a21"

RPROVIDES:${PN} += "aha \
aha(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
