SUMMARY = "Extra tools for VapourSynth"
DESCRIPTION = "This package contains the vspipe tool for interfacing with \
VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "62"

RPM_NAME = "vapoursynth-tools-62-1.2.aarch64.rpm"
RPM_HASH = "ac442dafacacec26cebb4355373dfdeb2b10f1e46104909a658b749357250cf104f90f8769a1c94ea5d3af86856bd1e32cbebbaaf7f2d2cb583ab80b3f023207"

RPROVIDES:${PN} += "vapoursynth-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvapoursynth-script.so.0"

inherit rpm
