SUMMARY = "Kernel time variables configuration utility"
DESCRIPTION = "This program gives you raw access to the kernel time variables. For \
a machine connected to the Internet, or equipped with a precision \
oscillator or radio clock, the best way to keep the system clock \
correct is with ntpd. However, for a standalone or intermittently \
connected machine, you may use adjtimex instead to at least correct \
for systematic drift. adjtimex can optionally adjust the system clock \
using the CMOS clock as a reference, and can log times for long-term \
estimation of drift rates."
LICENSE = "GPL-2.0-or-later"

PV = "1.29"

RPM_NAME = "adjtimex-1.29-8.13.aarch64.rpm"
RPM_HASH = "08d5acc4a8caddf297a0f947497b93ff5cb7fd7590df39b1c908a08761bea888842d03cb6dd06290aa2cebde91bc1ce40cef02a278f6e4a5403bbbb1010b9339"

RPROVIDES:${PN} += "adjtimex \
util-linux-/usr/sbin/adjtimex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
