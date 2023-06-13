SUMMARY = "openSUSE definitions of default settings and applications"
DESCRIPTION = "This package provides openSUSE defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "BSD-3-Clause"

PV = "42.1"

RPM_NAME = "gio-branding-openSUSE-42.1-20.3.noarch.rpm"
RPM_HASH = "629353ba4013a8f4789f36f8b5e68b52f77af2d4452c7c68c7b03079a2ccb1abefbb25429a5675f3f8cde6ef6cf675e4aeacb5aedfce909089f7cef2eebfeb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gio-branding-openSUSE) \
gio-branding \
gio-branding-openSUSE \
glib2-branding-openSUSE"

RDEPENDS:${PN} += "libgio-2_0-0"

inherit rpm
