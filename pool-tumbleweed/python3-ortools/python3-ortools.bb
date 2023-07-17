SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Python3 bindings for the OR-Tools suite, for solving combinatorial \
optimization problems."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "python3-ortools-9.6-2.1.aarch64.rpm"
RPM_HASH = "04d487fcf2aeb04f91bd9c25c216116d059fd1c053b5bc4bcfeeb378dac6f85f3412a03d2e7edbaf65f8025fdf8a59a3c6a08e12dd09456732b8d2532378decb"

RPROVIDES:${PN} += "python3-ortools \
python3.11dist-ortools \
python3dist-ortools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-flags-internal.so.2301.0.0 \
libabsl-flags-usage.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-log-flags.so.2301.0.0 \
libabsl-log-globals.so.2301.0.0 \
libabsl-log-initialize.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-throw-delegate.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libortools.so.9 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
python-abi \
python3-absl-py \
python3-numpy"

inherit rpm
