SUMMARY = "OpenTelemetry support for syslog-ng"
DESCRIPTION = "This package provides OpenTelemetry support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-opentelemetry-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "199d2b9640f00bad0507c2ccf64ec4b6da34ce7f09c49c4352fc129c1eaacf4f483e2244f5de9c19d7b5266458c44b6272dc7541405352ae76b7c759f588a5f4"

RPROVIDES:${PN} += "syslog-ng-opentelemetry"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-cord.so.2301.0.0 \
libabsl-cordz-functions.so.2301.0.0 \
libabsl-cordz-info.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libc.so.6 \
libevtlog-4.3.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpr.so.34 \
libgrpc++.so.1.57 \
libgrpc.so.34 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
