SUMMARY = "A search tool that combines ag with grep"
DESCRIPTION = "ripgrep is a line oriented search tool that combines the usability of \
The Silver Searcher (similar to ack) with the raw speed of GNU grep. \
ripgrep works by recursively searching your current directory \
for a regex pattern."
LICENSE = "MIT & Unlicense"

PV = "13.0.0"

RPM_NAME = "ripgrep-13.0.0-5.3.aarch64.rpm"
RPM_HASH = "b9af5cde6272ea8365be470e7071c725dbe39fcb3e542f2e5e183bbbb7e9382b751c99f497c3c5e4cfa143fdbc82b236e3b19dd23f331379c89293b797086d3a"

RPROVIDES:${PN} += "ripgrep \
ripgrep(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
