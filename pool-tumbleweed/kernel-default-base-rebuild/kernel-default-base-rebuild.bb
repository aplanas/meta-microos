SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-default-base-rebuild-6.4.11-1.2.28.9.aarch64.rpm"
RPM_HASH = "6b5653aaadebb180a3b930c4e8ff0876e37ffe0beff3bf17d7d81e9c62ff246b02775ac32472886e6466b4e141fd4fe829e2a93b1f5d68e1cc855b2820d0be90"

RPROVIDES:${PN} += "kernel-default-base-rebuild"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
