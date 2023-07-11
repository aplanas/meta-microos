SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Python3 bindings for the OR-Tools suite, for solving combinatorial \
optimization problems."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "python3-ortools-9.6-1.2.aarch64.rpm"
RPM_HASH = "7f691011b52eaa2b8619eb63b743544f130661b6b9bd7814d6eaea534c471e0a8558a15bb48e09d936525ab505295c8488f4300acf8f9fead7c436e441b20891"

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
libprotobuf-3.21.12.so \
libstdc++.so.6 \
python-abi \
python3-absl-py \
python3-numpy"

inherit rpm
