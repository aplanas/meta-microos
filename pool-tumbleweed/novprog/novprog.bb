SUMMARY = "Wordcount graphing program"
DESCRIPTION = "NovProg allows you to create a graph of your progress in writing a \
NaNoWriMo style novel. You enter your wordcount and it updates a graph \
showing you how much progress you have made. It also shows you how far you \
are through your daily goal, and your total goal. Mousing over a bar in the \
graph will show a tooltip with that day's wordcount."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.2"

RPM_NAME = "novprog-3.2.2-1.1.aarch64.rpm"
RPM_HASH = "25795383dbf00876bf296292c2866aaa82df5a8878081fd1c2163b1ddecd46cc5487ef949c3ace1b6f601a20c988a5d5f79049fa1060598b554d5e1ed6992d10"

RPROVIDES:${PN} += "novprog"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
