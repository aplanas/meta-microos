SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Python3 bindings for the OR-Tools suite, for solving combinatorial \
optimization problems."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "python3-ortools-9.6-3.2.aarch64.rpm"
RPM_HASH = "af41119dc308c6b9b77d0b6c64e640a7ef45cbb587f465931c3f56a75e76c087b5b5a4cfac077c28b09ec3157899aca6cb4d19ebf9878565aed87497e8569933"

RPROVIDES:${PN} += "python3-ortools \
python3.11dist-ortools \
python3dist-ortools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-flags-internal.so.2308.0.0 \
libabsl-flags-usage.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-log-flags.so.2308.0.0 \
libabsl-log-globals.so.2308.0.0 \
libabsl-log-initialize.so.2308.0.0 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-status.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-throw-delegate.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libortools.so.9 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
python-abi \
python3-absl-py \
python3-numpy"

inherit rpm
