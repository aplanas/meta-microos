SUMMARY = "Emoji annotation files in CLDR"
DESCRIPTION = "This package contains the pkg-config files for development when building \
programs that use cldr-annotations."
LICENSE = "LGPL-2.0-or-later & Unicode"

PV = "36.12.120191002_0"

RPM_NAME = "cldr-emoji-annotation-36.12.120191002_0-1.9.noarch.rpm"
RPM_HASH = "581aab67e4e269a2b19d8756f8ae258d2e81fed0bc20456d66beba2fa22b027f98f4592b03c3ecdb72c7228b53e208f063f67349b8781521cbdef1a967ffcce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cldr-emoji-annotation"

RDEPENDS:${PN} += ""

inherit rpm
