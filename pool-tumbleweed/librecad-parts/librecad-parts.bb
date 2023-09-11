SUMMARY = "Parts collection for LibreCAD"
DESCRIPTION = "Collection of parts for LibreCAD, a Qt application to design 2D \
CAD drawings."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.0.2"

RPM_NAME = "librecad-parts-2.2.0.2-1.1.noarch.rpm"
RPM_HASH = "a3416865c77b6e80f83e60a46621185907e6c6ec4866311c393e155fedbfd2422d25abbfa4d1f365b84f9a796aafda0d668e46b94c3cd2a789e877e0e92bbfc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librecad-parts"

RDEPENDS:${PN} += "librecad"

inherit rpm
