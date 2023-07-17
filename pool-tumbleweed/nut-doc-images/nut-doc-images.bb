SUMMARY = "Network UPS Tools - Images for Documentation"
DESCRIPTION = "Images for the documentation. It is a supplementary package for some NUT \
documentation packages. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-images-2.8.0-4.1.noarch.rpm"
RPM_HASH = "ee78b535ea23ce50f298bbffeeba59ec5d39e8fccb73c0cce1317644a8c8aa3fe0cdf3244e59c58e1a773334ecb0223a255df4c62f2a7f14a2923238d5de2f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-images"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
