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

RPM_NAME = "python311-line_profiler-4.0.3-1.3.aarch64.rpm"
RPM_HASH = "4917985bc8069a4a2284f55ca1c0503c762a1b011699ded1f8143be8e35e829231a15e2bbb1ec7b4a96a2abca222ee7937f2087ac1e7ffd461029776b5a91d00"

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
