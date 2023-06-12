SUMMARY = "Development files for swtpm"
DESCRIPTION = "The development files for SWTPM"
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "swtpm-devel-0.8.0-3.1.aarch64.rpm"
RPM_HASH = "efcf4ca733e2150482625a42d80843db6a5c2807944cd0446b4aa01589c03eb237aabb7f9b42f9b7b2b62ad0067439188342e1d64aa330d29cf9c6c0abbea15c"

RPROVIDES:${PN} += "swtpm-devel \
swtpm-devel(aarch-64)"
RDEPENDS:${PN} += "glib2-devel \
libopenssl-devel \
libseccomp-devel \
libtpms-devel \
swtpm"

inherit rpm
