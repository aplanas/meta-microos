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

RPM_NAME = "python310-line_profiler-4.0.3-2.1.aarch64.rpm"
RPM_HASH = "23dbca3d58f4626e4c2e4bc8966cefa7ea74471cca344d0d249127f53ae598db5c540ad8d8b59d25a0a57c89d3856adbd56032805004d8c525958e95dac7913f"

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
