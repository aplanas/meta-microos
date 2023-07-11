SUMMARY = "Shared library for mt32emu"
DESCRIPTION = "A multi-platform software synthesiser emulating pre-GM MIDI devices such as the Roland MT-32, CM-32L, CM-64 and LAPC-I. \
This package provides the mt32emu library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "libmt32emu2-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "30e2778fd0edf450c29e93a0d54015dee26594cabf26c6366f1b9c60ed7da4e15e19454771b4a4e22cd24a810d1115caa7321420f182c8e74b02aca5952e2a53"

RPROVIDES:${PN} += "libmt32emu.so.2 \
libmt32emu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
