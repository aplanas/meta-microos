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

RPM_NAME = "python310-line_profiler-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "10b7a4f7f810cec2dcdc8ed6ebc26176998ec97dc1467847ca6c922c8eda0d158874029300afcab4b50898fb28a4688ca7dc1eb7780b8c81840e89bfd967f320"

RPROVIDES:${PN} += "python3-line_profiler \
python3.10dist(line-profiler) \
python310-line_profiler \
python310-line_profiler(aarch-64) \
python3dist(line-profiler)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-ipython \
update-alternatives"

inherit rpm
