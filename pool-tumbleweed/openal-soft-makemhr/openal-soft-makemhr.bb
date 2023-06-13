SUMMARY = "OpenAL Soft HRTF generation utility"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains the makemhr utility for creating head-related \
transfer functions (HRTF)."
LICENSE = "GPL-2.0-or-later"

PV = "1.22.2"

RPM_NAME = "openal-soft-makemhr-1.22.2-1.4.aarch64.rpm"
RPM_HASH = "6c8f558e75be0719151ca1070991c01a583c83a1cc430789ee57cf8ed8ca746073c7351218a868879e7b8b6db034c311a6ccd5499d154a777ed21b4e661cd2e2"

RPROVIDES:${PN} += "makehrtf \
openal-soft-devel:/usr/bin/makehrtf \
openal-soft-makemhr \
openal-soft-makemhr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmysofa.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
