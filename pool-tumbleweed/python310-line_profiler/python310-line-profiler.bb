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

RPM_NAME = "python310-line_profiler-4.0.3-1.3.aarch64.rpm"
RPM_HASH = "f81459ce14a02d99ed41303758c969fc32eca9aaacc2c24619db7f0d633c4d3df3262ee79a92733c69f746e7f76eaf476ab65e11dd6f01ba882f1f2ad71e7779"

RPROVIDES:${PN} += "python3.10dist-line-profiler \
python310-line-profiler \
python3dist-line-profiler"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-ipython \
update-alternatives"

inherit rpm
