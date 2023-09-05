SUMMARY = "Include Files and Libraries for PAM Development"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool which \
allows system administrators to set authentication policy without \
having to recompile programs which do authentication. \
 \
This package contains header files and static libraries used for \
building both PAM-aware applications and modules for use with PAM."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-devel-1.5.3-3.1.aarch64.rpm"
RPM_HASH = "92dbe24bf1b221868985b0ede6a7ccca719885fad2e3ba3ec5e65dcecef289384b8f59c5a772a2202b35349b34351488979afbe41f76dd8f8ab2d94c9bfbbe7a"

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
