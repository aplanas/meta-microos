SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "BSD-2-Clause"

PV = "0.2.2"

RPM_NAME = "libsamplerate-devel-0.2.2-1.7.aarch64.rpm"
RPM_HASH = "839f24a358b9069729d8bcabedd058e7b891f0dc0f7a6d78466c384bff572f781fd9e8e005b0fdfdd420a291a6d7616cacb3e312fd4713ff0e5f81a67ec2b09d"

RPROVIDES:${PN} += "libsamplerate-devel \
pkgconfig-samplerate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsamplerate0"

inherit rpm
