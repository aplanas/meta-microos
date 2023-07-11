SUMMARY = "Tool for scanning DVB transponders"
DESCRIPTION = "w_scan is a small command line utility used to perform frequency scans for \
DVB and ATSC transmissions. It is capable of creating channels.conf files \
(in different output formats !) as well as initial tuning data for scan. \
It's based on the utility scan from linuxtv-dvb-apps, but meanwhile it was \
heavily changed and has different features."
LICENSE = "GPL-2.0-only"

PV = "20170107"

RPM_NAME = "w_scan-20170107-2.13.aarch64.rpm"
RPM_HASH = "5cfc9ec1b5796e1e6a81df1f9905b2c0fb8898520dc3efb434a146dc1c1760ca72ad5c9d2afbd1423a079b017cbc75e17bf1a20219ceafcb28aa4123e06e8f12"

RPROVIDES:${PN} += "w-scan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
