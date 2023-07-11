SUMMARY = "Header files for libShadowDive"
DESCRIPTION = "Development and header files for libShadowDive."
LICENSE = "MIT"

PV = "0.6.5+git.20190205"

RPM_NAME = "shadowdive-devel-0.6.5+git.20190205-3.13.aarch64.rpm"
RPM_HASH = "950da1e4dcab2d79ef3fe650afcca0d539c657f4166f73743fa395724fbe44e32df0be851ebbaf3afb0c6af1ea2f6679ef3e777ad9ae5c0ad38b6436746d0647"

RPROVIDES:${PN} += "shadowdive-devel"

RDEPENDS:${PN} += "libpng16-compat-devel \
libshadowdive0-0-0-suse"

inherit rpm
