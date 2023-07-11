SUMMARY = "Static version of qrupdate library"
DESCRIPTION = "This package contains the static version of the qrupdate libraries."
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-static-1.1.2-3.32.aarch64.rpm"
RPM_HASH = "0415a546e734a86dc1ec035c16105f4fb398f2eb09859e2ecf020b404518ee05a33e5d1eaf241f624f436a6cfab140516af8d3d579aee2eaf6c2364e633e1250"

RPROVIDES:${PN} += "qrupdate-static"

RDEPENDS:${PN} += ""

inherit rpm
