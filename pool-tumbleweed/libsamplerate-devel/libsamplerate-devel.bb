SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "BSD-2-Clause"

PV = "0.2.2"

RPM_NAME = "libsamplerate-devel-0.2.2-1.8.aarch64.rpm"
RPM_HASH = "a2781c97dcdfb06ff011fd8c99e54a380d393bc943ac1f7427a5f206a345705abbe4414e32b64fc48a1699d08d91f4b5b6b3d18edb4efb5271134a7dd3b8a985"

RPROVIDES:${PN} += "libsamplerate-devel \
pkgconfig-samplerate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsamplerate0"

inherit rpm
