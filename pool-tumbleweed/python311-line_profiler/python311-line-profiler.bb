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

RPM_NAME = "python311-line_profiler-4.0.3-2.1.aarch64.rpm"
RPM_HASH = "a94a611f6ed585b00085fac517f1668862140828f07ec7631f9f272b5d3ede5b245c4679a8ad32a71651f975425fbf249dc47f97f99b3eda956cec626e50402e"

RPROVIDES:${PN} += "python3-line-profiler \
python3.11dist-line-profiler \
python311-line-profiler \
python3dist-line-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-ipython \
update-alternatives"

inherit rpm
