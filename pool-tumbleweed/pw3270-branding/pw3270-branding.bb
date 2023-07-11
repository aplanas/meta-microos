SUMMARY = "Default branding for pw3270"
DESCRIPTION = "GTK-based IBM 3270 terminal emulator with many advanced features. It can be used to communicate with any IBM host that supports 3270-style connections over TELNET. \
 \
This package contains the default branding for pw3270."
LICENSE = "GPL-2.0-only"

PV = "5.4"

RPM_NAME = "pw3270-branding-5.4-2.2.noarch.rpm"
RPM_HASH = "9ca7f0dab7d7ca9142b12f0e025ecb1ae5e59e720aafd3fe35ebeaa58740a01baf2fe33f6c52a8d65641a561c6d2b140b6df887a7aae1fb5f73a5817bf1643af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pw3270-branding"

RDEPENDS:${PN} += "desktop-file-utils \
pw3270"

inherit rpm
