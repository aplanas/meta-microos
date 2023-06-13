SUMMARY = "Stream Analyzer"
DESCRIPTION = "Stan is a small console application that works on all UNIX systems. It \
is able to generate several types of statistical information about a \
stream. A stream can be either standard input or given files. For \
example, stan can be used to analyze encrypted data or to measure the \
quality of a pseudo-random number generator, but there are probably \
hundreds of other situations where stan comes in handy. \
 \
Stan supports three types of analysis: general statistics, pattern \
statistics, and bit statistics. By choosing intelligent values for each \
statistic, stan can give amazing results about a stream and is fun to \
work with."
LICENSE = "BSD-4-Clause"

PV = "0.4.1"

RPM_NAME = "stan-0.4.1-10.23.aarch64.rpm"
RPM_HASH = "8266ef6149824d5d1230ca109c46c4691cb48496f414f17e33ee17943e04d53696676ee53896876c2b03c5a1889509a4728ceab881ae634c6a59abc61257e513"

RPROVIDES:${PN} += "stan \
stan(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
