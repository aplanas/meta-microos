SUMMARY = "openSUSE definitions of default settings and applications"
DESCRIPTION = "This package provides openSUSE defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "BSD-3-Clause"

PV = "42.1"

RPM_NAME = "gio-branding-openSUSE-42.1-20.4.noarch.rpm"
RPM_HASH = "529c9ff8cb515fb233b8bf9311325e0e492849be38697903b36eb057a1fd0fd46e2a31251b551b58a40c8343b247bb1ba03332e1b8f959a10db16c412657660d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gio-branding-openSUSE \
gio-branding \
gio-branding-openSUSE \
glib2-branding-openSUSE"

RDEPENDS:${PN} += "libgio-2-0-0"

inherit rpm
