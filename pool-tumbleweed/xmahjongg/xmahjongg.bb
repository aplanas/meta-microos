SUMMARY = "Colorful X solitaire MahJongg game"
DESCRIPTION = "Real Mah Jongg is a social game that originated in China thousands of \
years ago. Four players, named after the four winds, take tiles from a \
wall in turn. The best tiles are made of ivory and wood; they click \
pleasantly when you knock them together. Computer Solitaire Mah Jongg \
(xmahjongg being one of the sillier examples) is nothing like that but \
it's fun, or it must be, since there are like 300 shareware versions \
available for Windows. This is for X11 and it's free."
LICENSE = "GPL-2.0-or-later"

PV = "3.7"

RPM_NAME = "xmahjongg-3.7-7.1.aarch64.rpm"
RPM_HASH = "df5a170f5c921c91dd62bff2203097c47c6607d1b8d95ec811ccf77ab6115a9dd2ef419ee97e171615a0d005a899016949f94550e722fd9d2c17acfbb51543cf"

RPROVIDES:${PN} += "xmahjongg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
