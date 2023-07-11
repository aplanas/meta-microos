SUMMARY = "Rate limiting data piping tool"
DESCRIPTION = "Sluice reads from standard input and write to standard output at a specified \
data rate. This can be useful for benchmarking and exercising I/O streaming at \
desired throughput rates."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.13"

RPM_NAME = "sluice-0.02.13-1.9.aarch64.rpm"
RPM_HASH = "62ca3f7a752f3145b1f8408b692c886e82291a14c668c1bde8aaf3cafe1fd0440e7ef8e834c9e7a9e2869e7496093ab6212a165a3ab949ae08178ce50bcbbaa1"

RPROVIDES:${PN} += "sluice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
