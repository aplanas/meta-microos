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

RPM_NAME = "python39-line_profiler-4.0.3-2.1.aarch64.rpm"
RPM_HASH = "757cda3b30d6918c10630274d29e5aa4697268202ce7e71e8e4219af44025659759578d892d4d523ae466d05cd674d49b40d39276aca1300b6f32ff2191d0acd"

RPROVIDES:${PN} += "python3.9dist-line-profiler \
python39-line-profiler \
python3dist-line-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-ipython \
update-alternatives"

inherit rpm
