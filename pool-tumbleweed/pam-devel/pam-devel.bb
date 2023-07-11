SUMMARY = "Include Files and Libraries for PAM Development"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool which \
allows system administrators to set authentication policy without \
having to recompile programs which do authentication. \
 \
This package contains header files and static libraries used for \
building both PAM-aware applications and modules for use with PAM."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-devel-1.5.3-1.2.aarch64.rpm"
RPM_HASH = "c3d6bccfd3bd30a1fc222ffabeb417b194b272cfc1376c7bbfaff1fc9633e9b661e861e174cd03250811fd9429344a59e0b83badfe1d87f18cb2ddaea8fd2213"

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
