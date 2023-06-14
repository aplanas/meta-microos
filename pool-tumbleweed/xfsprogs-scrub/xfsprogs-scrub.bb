SUMMARY = "XFS scrubbing scripts and service files"
DESCRIPTION = "Scripts and systemd service files for background scrubbing of metadata \
on xfs filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "6.3.0"

RPM_NAME = "xfsprogs-scrub-6.3.0-1.1.aarch64.rpm"
RPM_HASH = "5400cbfc993bc7ee1c3642656e1c7a274a04edf166bda4a626da8bb84d828fab6e764ff7b95ddff55b4f8606d3ad62b98f12f3856403a14b6d596c262f476c92"

RPROVIDES:${PN} += "xfsprogs-scrub"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
xfsprogs"

inherit rpm
