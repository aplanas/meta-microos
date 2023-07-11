SUMMARY = "Extra tools for VapourSynth"
DESCRIPTION = "This package contains the vspipe tool for interfacing with \
VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "63"

RPM_NAME = "vapoursynth-tools-63-1.1.aarch64.rpm"
RPM_HASH = "446081db26c4c8cf6bdb5a9e9b3dd5db3e27a012020f3547c79a4a9bf314a87789ff7c21a878df231d39e5651862eaaf5592f061a4298277212bdcee44dbf127"

RPROVIDES:${PN} += "vapoursynth-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvapoursynth-script.so.0"

inherit rpm
