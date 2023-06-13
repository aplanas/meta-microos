SUMMARY = "Star Traders, a simple game of interstellar trading"
DESCRIPTION = "Star Traders is a simple game of interstellar trading, where the objective \
is to create companies, buy and sell shares, borrow and repay money, in \
order to become the wealthiest player (the winner)."
LICENSE = "GPL-3.0-or-later"

PV = "7.18"

RPM_NAME = "trader-7.18-1.3.aarch64.rpm"
RPM_HASH = "94d0c7989d1a3b4c89b4999a4bedbef5ce5c71bcc8534c43a95a6d6f78c707c86e00cefa3518f73640b2cd2124ed09a4952f1194dc0e4998a21f4bc2b1539050"

RPROVIDES:${PN} += "application() \
application(trader.desktop) \
metainfo() \
metainfo(trader.appdata.xml) \
trader \
trader(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
