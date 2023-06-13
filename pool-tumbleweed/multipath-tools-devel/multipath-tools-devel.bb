SUMMARY = "Development libraries for multipath-tools"
DESCRIPTION = "This package contains the development libraries for multipath-tools \
and libmpathpersist."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "multipath-tools-devel-0.9.5+68+suse.d1b6a1c-1.1.aarch64.rpm"
RPM_HASH = "9c04f61209d0ec367da7d26fc6d09a5ee690f64a866540f24f863a3a7caaa0ed9665247b519716e692cf22b1c5eb781bd19d97ab2eefb335af57d480d4e1d955"

RPROVIDES:${PN} += "multipath-tools-devel \
multipath-tools-devel(aarch-64)"

RDEPENDS:${PN} += "libmpath0"

inherit rpm
