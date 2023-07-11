SUMMARY = "Sndfile plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Sndfile plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-sndfile-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "5890ea6f917ae423eeb5b9694bb0131aa362bd6744f41b4917e6e0f674f4f4f90128624385ab09f11601cc6efc4da8e89fc5c66477b32fa756b733a0b851616e"

RPROVIDES:${PN} += "audaspace-fileplugin \
audaspace-plugin-sndfile \
libaudlibsndfile.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
