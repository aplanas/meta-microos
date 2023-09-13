SUMMARY = "OpenTelemetry support for syslog-ng"
DESCRIPTION = "This package provides OpenTelemetry support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-opentelemetry-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "926285418b0fdebbd535c7edb868f3bb58c390b5c071595aa5507bb40420f39ac1b59ef92712b57282258c1ec9ca985e1ebd67ae8e4f9f2a249e6609ddca5905"

RPROVIDES:${PN} += "syslog-ng-opentelemetry"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-cord.so.2308.0.0 \
libabsl-cordz-functions.so.2308.0.0 \
libabsl-cordz-info.so.2308.0.0 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libc.so.6 \
libevtlog-4.3.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpr.so.35 \
libgrpc++.so.1.58 \
libgrpc.so.35 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
