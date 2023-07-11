SUMMARY = "A network QoS (Quality of Service) script"
DESCRIPTION = "Many cablemodem and ADSL users experience horrifying latency while \
uploading or downloading. They also notice that uploading hampers \
downloading greatly. The wondershaper neatly addresses these issues, \
allowing users of a router with a wondershaper to continue using SSH \
over a loaded link happily."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1+git.20211015"

RPM_NAME = "wondershaper-1.4.1+git.20211015-1.5.noarch.rpm"
RPM_HASH = "0ace717f4dec8a7b1c90e599ab0ea622dfb5a0a775534edb4768c863e543b3d9a47f5fa96261c2a47f2c5e62f27e00756d81ee88e322639721871d3a46a27edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-wondershaper \
wondershaper"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
iproute2"

inherit rpm
