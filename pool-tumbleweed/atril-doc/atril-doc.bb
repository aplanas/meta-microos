SUMMARY = "Documentation how to Use Atril"
DESCRIPTION = "This package contains the documentation for atril"
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-doc-1.26.1-1.2.noarch.rpm"
RPM_HASH = "536faa4741dc1c8dc1c3aef28b75fe6e732f99535128d564000db6ea2985f59c7ab9bb4036d32f4a557cf8c72fe686d79a0b6608e3f09a1d735367c40b275094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atril-doc"

RDEPENDS:${PN} += "atril"

inherit rpm
