SUMMARY = "Code coverage tool without special compilation options"
DESCRIPTION = "Kcov is a code coverage tester for compiled programs, Python scripts and shell \
scripts.  It allows collecting code coverage information from executables \
without special command-line arguments, and continuously produces output from \
long-running applications."
LICENSE = "GPL-2.0-only"

PV = "41"

RPM_NAME = "kcov-41-1.1.aarch64.rpm"
RPM_HASH = "55b6f07410cfcf87e47b8cd7aec07af5f8a15bc5bb0b8d8891a2aa859dcf1a8eff9a2c52881b2650038c948663aeaaf46ce8db7575a0fbe3ba557f8dca59c1f0"

RPROVIDES:${PN} += "kcov"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
