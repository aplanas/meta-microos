SUMMARY = "Powerful figlet replacement"
DESCRIPTION = "TOIlet is in its very early development phase. It uses the powerful libcucul \
library to achieve various text-based effects. TOIlet implements or plans to \
implement the following features: \
 * The ability to load FIGlet fonts \
 * Support for Unicode input and output \
 * Support for colour output \
 * Support for various output formats: HTML, IRC, ANSI... \
 \
TOIlet also aims for full FIGlet compatibility. It is currently able to load \
FIGlet fonts and perform horizontal smushing."
LICENSE = "WTFPL"

PV = "0.3"

RPM_NAME = "toilet-0.3-1.12.aarch64.rpm"
RPM_HASH = "db74de2ae63f04ab871b5b9fc8e527bd367297a9934fa4d725b605eeb782302c436c5602a7fef55a97e143f0248c8991f3a0b82d1fa6c241be33ddeccce006d8"

RPROVIDES:${PN} += "toilet \
toilet(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcaca.so.0()(64bit)"

inherit rpm
