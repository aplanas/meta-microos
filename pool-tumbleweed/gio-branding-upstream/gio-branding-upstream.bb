SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "gio-branding-upstream-2.76.5-1.1.noarch.rpm"
RPM_HASH = "cb1208765b802354bd1d27cd9ebd56792eae37ce0c871cc255668993c6a0c9ea3e005bb4d502c3b82a115064aae016a259d2099d209c8ef591da18a6f80a280c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gio-branding-upstream \
gio-branding \
gio-branding-upstream \
glib2-branding-upstream"

RDEPENDS:${PN} += "libgio-2-0-0"

inherit rpm
