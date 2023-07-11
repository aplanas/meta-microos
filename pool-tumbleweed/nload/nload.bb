SUMMARY = "Monitors network traffic and bandwidth usage"
DESCRIPTION = "nload is a console application which monitors network traffic and bandwidth \
usage in real time. It visualizes the in- and outgoing traffic using two graphs \
and provides additional info like total amount of transfered data and min/max \
network usage."
LICENSE = "GPL-2.0+"

PV = "0.7.4"

RPM_NAME = "nload-0.7.4-1.31.aarch64.rpm"
RPM_HASH = "ebe171bb245765ae83f6a2de7cf695002e700e00c0f7c2f2e918f53052aa8df458dcacee5c2424bc1b3d2cf58c09ea579ac661caabffb66da4a2305b66514181"

RPROVIDES:${PN} += "nload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
