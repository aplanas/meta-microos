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

RPM_NAME = "adjtimex-1.29-8.12.aarch64.rpm"
RPM_HASH = "120aca5c0d718eea4980d73e98c12f4559f5217679c3fce642f8930e157e4c5ffa90d2c8826c80ac2bb9f67bd4fea20f04297f273b26a5f0b343458b059d9794"

RPROVIDES:${PN} += "adjtimex \
adjtimex(aarch-64) \
util-linux:/usr/sbin/adjtimex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
