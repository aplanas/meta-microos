SUMMARY = "Python bindings for libpfm and perf_event_open system call"
DESCRIPTION = "This package provides python bindings for the libpfm4 package and the perf_event_open system call."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python310-libpfm-4.13.0-1.3.aarch64.rpm"
RPM_HASH = "78cd4f20ec3bb7dffcb925f6dc0cba45db1baeef518cb73868d7442a7b2c6082514a788b56a8e60c0b4f709e32d2b434cf68db810476e925c72f2c081295fd93"

RPROVIDES:${PN} += "python3.10dist-perfmon \
python310-libpfm \
python3dist-perfmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4 \
libpfm4 \
python-abi"

inherit rpm
