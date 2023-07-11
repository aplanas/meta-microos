SUMMARY = "Bobcat static library"
DESCRIPTION = "Bobcat static library"
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat-light-devel-static-6.02.02-2.4.aarch64.rpm"
RPM_HASH = "18332d0f2cc655232303d04b49cb3cd0177bbfe5e36f43cb151e30109f689a6ef7048abf1658a05ed03a86987193de95be7ac4b37d28716396cf036ad192b209"

RPROVIDES:${PN} += "libbobcat-light-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
