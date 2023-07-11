SUMMARY = "Eximon, an graphical frontend to administer Exim's mail queue"
DESCRIPTION = "This allows administrators to view the exim agent's mail queue and \
logs, and perform a variety of actions on queued messages, such as \
freezing, bouncing and thawing messages, and even editing body and \
header of mails."
LICENSE = "GPL-2.0-or-later"

PV = "4.96"

RPM_NAME = "eximon-4.96-5.3.aarch64.rpm"
RPM_HASH = "9daea6faaadea9654ea3a8eb098529664976e066eec0d25592ca9ee892cc82244d6117485f19f87d102a3245a01c085195db583a1d7f495842e0ff3a5b4f963d"

RPROVIDES:${PN} += "eximon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
