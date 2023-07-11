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

RPM_NAME = "python39-line_profiler-4.0.3-1.3.aarch64.rpm"
RPM_HASH = "aa7272896cfb6df9ba95a5702bb6a23e1e5503b25bde16ec678f54a7b7c2e337d0a0e3048ccbb062fd4b814cdba362121afa916c2dc117e9ae8f1ede6c05efc0"

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
