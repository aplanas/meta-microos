SUMMARY = "MP3 Volume Normalizer based on Replay Gain"
DESCRIPTION = "MP3Gain analyzes and adjusts mp3 files so that they have the same volume. \
It does not just do peak normalization, as many normalizers do. Instead, \
it does some statistical analysis to determine how loud the file actually \
sounds to the human ear. Also, the changes MP3Gain makes are completely \
lossless. There is no quality lost in the change because the program \
adjusts the mp3 file directly, without decoding and re-encoding."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.2"

RPM_NAME = "mp3gain-1.6.2-2.13.aarch64.rpm"
RPM_HASH = "2e5945c30bdd456dca27b1228a316f6ec205ecf8823bf23982397cd027c974eb1577c3838e375694931ac993e0257c056e9c9abb8095eedf1645da159111758e"

RPROVIDES:${PN} += "mp3gain \
mp3gain(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpg123.so.0()(64bit)"

inherit rpm