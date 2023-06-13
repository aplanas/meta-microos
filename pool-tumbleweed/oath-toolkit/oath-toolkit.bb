SUMMARY = "Toolkit for one-time password authentication systems"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. It contains shared libraries, command line \
tools and a PAM module. Supported technologies include the \
event-based HOTP algorithm (RFC4226) and the time-based TOTP algorithm \
(RFC6238). OATH stands for Open AuTHentication, which is the \
organization that specify the algorithms. For managing secret key \
files, the Portable Symmetric Key Container (PSKC) format described in \
RFC6030 is supported."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.6.7"

RPM_NAME = "oath-toolkit-2.6.7-3.5.aarch64.rpm"
RPM_HASH = "1d3aa9fbffabe947a37176c282b39b15e21010eada1e648c1d0cde713dc74aef55b51ad647f22f6224c326d6854fbf52f9633e5e7f4f3f2bfde4d98c032635a4"

RPROVIDES:${PN} += "oath-toolkit \
oath-toolkit(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liboath.so.0()(64bit) \
libpskc.so.0()(64bit)"

inherit rpm
