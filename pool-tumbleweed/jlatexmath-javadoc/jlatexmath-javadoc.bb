SUMMARY = "API Documentation for jlatexmath"
DESCRIPTION = "This package contains the API documentation for jlatexmath."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-javadoc-1.0.3-6.6.noarch.rpm"
RPM_HASH = "16a46bba85f9977111120273b8f87ff3e8b469e5f712cb2f8e26c2a0166265d702bc79a6dd8c549e0db20d4fc7c46fb43b948ee83c6f243ec31a8d206a39e7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath-javadoc"
RDEPENDS:${PN} += "jlatexmath"

inherit rpm
