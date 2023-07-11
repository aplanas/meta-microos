SUMMARY = "Development files for libmt32emu"
DESCRIPTION = "A multi-platform software synthesiser emulating pre-GM MIDI devices such as the Roland MT-32, CM-32L, CM-64 and LAPC-I. \
Development files for libmt32emu."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "libmt32emu-devel-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "d6a3e4c4899a3e091941948e24336223fe97a2613d5575810fd59057a36365d96b7f412b1f4ecbf27bf2001e22e3e5ecf6329438801d1487a63a1999050f94c5"

RPROVIDES:${PN} += "libmt32emu-devel \
pkgconfig-mt32emu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmt32emu2"

inherit rpm
