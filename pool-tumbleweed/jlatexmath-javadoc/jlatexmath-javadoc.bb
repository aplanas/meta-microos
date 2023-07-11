SUMMARY = "API Documentation for jlatexmath"
DESCRIPTION = "This package contains the API documentation for jlatexmath."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-javadoc-1.0.3-6.7.noarch.rpm"
RPM_HASH = "00558dafc0ca70f7bf83da2f4d26c954bbd6847ac15f3e089b9319c47909502f90860b334d95520d28f08d2746137fa6a5aa8f602a154f10ebe46888a402b4ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath-javadoc"

RDEPENDS:${PN} += "jlatexmath"

inherit rpm
