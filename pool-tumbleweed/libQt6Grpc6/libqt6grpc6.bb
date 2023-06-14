SUMMARY = "Qt 6 Grpc library"
DESCRIPTION = "The Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Grpc6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4b65fe6c49a74e628443691e1ab89389ed913ea17c3aec329e5885f4e8a998da81db3661dbfa9ad4c83c8e31adf3ffc84a409cf12dab37598a028fb29ac63588"

RPROVIDES:${PN} += "libQt6Grpc.so.6 \
libQt6Grpc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Protobuf.so.6 \
libabsl-synchronization.so.2301.0.0 \
libc.so.6 \
libgpr.so.31 \
libgrpc++.so.1.54 \
libgrpc.so.31 \
libstdc++.so.6"

inherit rpm
