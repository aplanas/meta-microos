SUMMARY = "Line-by-line profiler"
DESCRIPTION = "line_profiler will profile the time individual lines of code take to execute. \
The profiler is implemented in C via Cython in order to reduce the overhead of \
profiling. \
 \
Also included is the script kernprof.py which can be used to conveniently \
profile Python applications and scripts either with line_profiler or with the \
function-level profiling tools in the Python standard library."
LICENSE = "BSD-3-Clause"

PV = "4.0.3"

RPM_NAME = "python39-line_profiler-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "c1bd925655786b103a82772381375f0695a7aa557183d5111cb8f73c5a8c6b60e6e95daed28b6f14004a3162b7eff6161d69a5e0f96f2e21779b30cc6be95e14"

RPROVIDES:${PN} += "python3.9dist(line-profiler) \
python39-line_profiler \
python39-line_profiler(aarch-64) \
python3dist(line-profiler)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi) \
python39-ipython \
update-alternatives"

inherit rpm