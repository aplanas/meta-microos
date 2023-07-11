SUMMARY = "Python bindings for libpfm and perf_event_open system call"
DESCRIPTION = "This package provides python bindings for the libpfm4 package and the perf_event_open system call."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python39-libpfm-4.13.0-1.3.aarch64.rpm"
RPM_HASH = "641d75986f309034f5aaf9cef9525cbef1f4d76a74dffe4b52d126d2105a319c12337838bfbeb5ddcf90c1e2acbd03ac19c32a3158a36378893dbfd50ba89027"

RPROVIDES:${PN} += "python3.9dist-perfmon \
python39-libpfm \
python3dist-perfmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4 \
libpfm4 \
python-abi"

inherit rpm
