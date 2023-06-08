SUMMARY = "Eximon, an graphical frontend to administer Exim's mail queue"
DESCRIPTION = "This allows administrators to view the exim agent's mail queue and \
logs, and perform a variety of actions on queued messages, such as \
freezing, bouncing and thawing messages, and even editing body and \
header of mails."
LICENSE = "GPL-2.0-or-later"

PV = "4.96"

RPM_NAME = "eximon-4.96-5.1.aarch64.rpm"
RPM_HASH = "f39937de752477d4492322f8744acfee04ccc029bbd6fde3e9cefcdc46f433ff6864f984295c278825296c5ae4cd90132fac26913179e1480824b2259c4bff70"

RPROVIDES:${PN} += "eximon eximon(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcre2-8.so.0()(64bit)"

inherit rpm
