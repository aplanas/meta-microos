SUMMARY = "openSUSE branding of gcin"
DESCRIPTION = "This package provides openSUSE Look and Feel for gcin"
LICENSE = "LGPL-2.1"

PV = "12.1"

RPM_NAME = "gcin-branding-openSUSE-12.1-10.33.noarch.rpm"
RPM_HASH = "da6f66de13bb15fa15c844f66b3afa45d6f4aeb530279378f7d8a4616c3b0aa1d3ed61130c9c029a676ee8fff1b2393bbee98d68ee5d5491487c95532bef3e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcin-branding \
gcin-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
gcin"

inherit rpm
