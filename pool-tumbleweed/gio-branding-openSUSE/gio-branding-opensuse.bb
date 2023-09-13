SUMMARY = "openSUSE definitions of default settings and applications"
DESCRIPTION = "This package provides openSUSE defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "BSD-3-Clause"

PV = "42.1"

RPM_NAME = "gio-branding-openSUSE-42.1-20.5.noarch.rpm"
RPM_HASH = "e0d985adbd7eee66de4fda87932577e4efa2d8398fd4f021c43b3910dab7f2de58eb5430d3e38ba9c102c8b5b2df0a344db2c75ed24a8c09cfee3dbf13298984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gio-branding-openSUSE \
gio-branding \
gio-branding-openSUSE \
glib2-branding-openSUSE"

RDEPENDS:${PN} += "libgio-2-0-0"

inherit rpm
