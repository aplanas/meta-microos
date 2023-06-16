SUMMARY = "A network QoS (Quality of Service) script"
DESCRIPTION = "Many cablemodem and ADSL users experience horrifying latency while \
uploading or downloading. They also notice that uploading hampers \
downloading greatly. The wondershaper neatly addresses these issues, \
allowing users of a router with a wondershaper to continue using SSH \
over a loaded link happily."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1+git.20211015"

RPM_NAME = "wondershaper-1.4.1+git.20211015-1.4.noarch.rpm"
RPM_HASH = "b1c98b8f4ad8a0dd0178cdef0faccf1e978d1b749279a877657a103c9c674cad6601b40ad374ce3a15f4b71723284aab9ff8c6d1f890516dc9ee60872817d2cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-wondershaper \
wondershaper"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
iproute2"

inherit rpm
