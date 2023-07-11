SUMMARY = "Code coverage tool without special compilation options"
DESCRIPTION = "Kcov is a code coverage tester for compiled programs, Python scripts and shell \
scripts.  It allows collecting code coverage information from executables \
without special command-line arguments, and continuously produces output from \
long-running applications."
LICENSE = "GPL-2.0-only"

PV = "41"

RPM_NAME = "kcov-41-1.2.aarch64.rpm"
RPM_HASH = "19b16e8f6fd623d47c1e73ca03220b2cf885cb71e882e4a2a44fec913f8013b6a2e1497e4a80f3018537766f62b0aa4ebc9d036111a5dcfe6876b5a9e6172440"

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
