SUMMARY = "Python bindings for libpfm and perf_event_open system call"
DESCRIPTION = "This package provides python bindings for the libpfm4 package and the perf_event_open system call."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python311-libpfm-4.13.0-1.3.aarch64.rpm"
RPM_HASH = "0cb39f9cf363c20ac3d239c54e26a65b71f46010630ce443641389f6f9f720868f06a6ad525d164b969cbb8d7de19cbeb8136f393616bbaec8e88326bd76bbe6"

RPROVIDES:${PN} += "python3-libpfm \
python3.11dist-perfmon \
python311-libpfm \
python3dist-perfmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4 \
libpfm4 \
python-abi"

inherit rpm
