SUMMARY = "Access KIO over the regular filesystem"
DESCRIPTION = "kio-fuse is a daemon which makes KIO URLs accessible to KIO unaware \
applications using FUSE."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.1"

RPM_NAME = "kio-fuse-5.0.1-3.7.aarch64.rpm"
RPM_HASH = "517a31fb66233970578f3014ccdd144336d05189821472ccb9df55857c7c815ea86f42fe8641077c5100194da39edc28834b1854b65ce6595bc9ad4090eadc3e"

RPROVIDES:${PN} += "kio-fuse"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libfuse3.so.3 \
libstdc++.so.6"

inherit rpm
