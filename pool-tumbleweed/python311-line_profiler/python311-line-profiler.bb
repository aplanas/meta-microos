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

RPM_NAME = "python311-line_profiler-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "356223930f41ac6422c4636eaedcc0dfb65e6e2dd8d2a2d70c1214243fe349cdeda3a87fe73da63f01d61d3569cbe25e16b766ee8edb665d2e81af8b8a85f29b"

RPROVIDES:${PN} += "python3.11dist-line-profiler \
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
