SUMMARY = "Utilities for analysing and setting file capabilities"
DESCRIPTION = "The libcap-ng-utils package contains applications to analyse the \
Linux process capabilities of programs running on a system. It also \
lets you set the filesystem-based capabilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng-utils-0.8.3-2.3.aarch64.rpm"
RPM_HASH = "55c8f6498e911c7a43f1b20e7a8723b4f0ef38ee6eba82993bdefdb233d66cfd2a569573b6fce28e1080e0303619a5cee65ea0cdb9f7e7b01abaad96c4c0e59d"

RPROVIDES:${PN} += "libcap-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0"

inherit rpm
