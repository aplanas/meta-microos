SUMMARY = "XFS scrubbing scripts and service files"
DESCRIPTION = "Scripts and systemd service files for background scrubbing of metadata \
on xfs filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "xfsprogs-scrub-6.4.0-1.1.aarch64.rpm"
RPM_HASH = "474f8472fb33c94ccb7b91e172b08553f04d23caca276e284412fa9665c4d3168090ab007e3548d6724506cdbb420c9f840892fd06db20e758dc72a271911d68"

RPROVIDES:${PN} += "xfsprogs-scrub"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
xfsprogs"

inherit rpm
