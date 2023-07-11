SUMMARY = "Star Traders, a simple game of interstellar trading"
DESCRIPTION = "Star Traders is a simple game of interstellar trading, where the objective \
is to create companies, buy and sell shares, borrow and repay money, in \
order to become the wealthiest player (the winner)."
LICENSE = "GPL-3.0-or-later"

PV = "7.18"

RPM_NAME = "trader-7.18-1.4.aarch64.rpm"
RPM_HASH = "a5fbd1be878756c229ef01a16bdd113a93961efbb75d2ad03ba09f3059f1626d0b3da157964320b59235a01610ee2a5f15bcbd261437c04410457f4899b3ed5f"

RPROVIDES:${PN} += "trader"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
