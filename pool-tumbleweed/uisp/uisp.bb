SUMMARY = "An upload tool for AVR microcontrollers"
DESCRIPTION = "Uisp is a tool for AVR microcontrollers and drives many hardware \
in-system programmers. Uisp allows programming a microcontroller \
through the parallel port."
LICENSE = "GPL-2.0-or-later"

PV = "20050207suse"

RPM_NAME = "uisp-20050207suse-169.6.aarch64.rpm"
RPM_HASH = "003326276179f78ccc9a10da0c0ee13049b32dadd42986d7ee594ec5e3587a4839c927e4f932a25f72c09cc2f5e8fc850c6136a2bd1ee77ca79d3b3381dd69a3"

RPROVIDES:${PN} += "avr-programmer \
uisp \
uisp(aarch-64)"

RDEPENDS:${PN} += "/bin/cat \
/bin/sh \
/sbin/modprobe \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
