SUMMARY = "Include Files and Libraries for PAM Development"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool which \
allows system administrators to set authentication policy without \
having to recompile programs which do authentication. \
 \
This package contains header files and static libraries used for \
building both PAM-aware applications and modules for use with PAM."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-devel-1.5.3-2.1.aarch64.rpm"
RPM_HASH = "9e5c4d89b02e6420667bc3493819b1742464c74932a75e97b183517e1ef5ef23e207fbaebf195adfa9f95330e62d53e246b34e6f15b9adf3c022d42d171bf690"

RPROVIDES:${PN} += "pam-devel \
pkgconfig-pam \
pkgconfig-pam-misc \
pkgconfig-pamc \
rpm-macro--pam-confdir \
rpm-macro--pam-libdir \
rpm-macro--pam-moduledir \
rpm-macro--pam-secconfdir \
rpm-macro--pam-secdistconfdir \
rpm-macro--pam-vendordir \
rpm-macro--pamdir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
pam"

inherit rpm
