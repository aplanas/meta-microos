SUMMARY = "Indicator shared files"
DESCRIPTION = "A package that has files needed to work with the indicators. This \
includes the systemd indicators-pre.target."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "indicator-common-16.10.0+bzr20171205-4.16.aarch64.rpm"
RPM_HASH = "c2f8edcea027707d44e88b3a43ac37c99ecb56ffdb1578de95ca1d6f7bff2d42d5b9ff502a8b863d0d320741d9829bc7d0bed864795f287ab154dd810d511544"

RPROVIDES:${PN} += "indicator-common"

RDEPENDS:${PN} += ""

inherit rpm
