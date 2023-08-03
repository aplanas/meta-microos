SUMMARY = "OpenTelemetry support for syslog-ng"
DESCRIPTION = "This package provides OpenTelemetry support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-opentelemetry-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "a75f8e433ccfd3e16249f438f7589cb4438c1e8c3008110b47310147aa01085017bb3a4fcaf90281d73e869011c683f290da7f8fc5161f38b45924c025999b56"

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
libgpr.so.33 \
libgrpc++.so.1.56 \
libgrpc.so.33 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
