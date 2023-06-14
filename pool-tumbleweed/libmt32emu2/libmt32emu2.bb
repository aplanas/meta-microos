SUMMARY = "Shared library for mt32emu"
DESCRIPTION = "A multi-platform software synthesiser emulating pre-GM MIDI devices such as the Roland MT-32, CM-32L, CM-64 and LAPC-I. \
This package provides the mt32emu library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "libmt32emu2-2.7.0-1.3.aarch64.rpm"
RPM_HASH = "62dcdfddd6bcd448fca8abab3eac979e0ebbd004ca55c8c918a5e523e6f83858b3030a73376c1983fa34919e22f8653629d0eebb8b9d07ff9b0ee722960bd9f2"

RPROVIDES:${PN} += "libmt32emu.so.2 \
libmt32emu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
