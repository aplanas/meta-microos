SUMMARY = "Include Files and Libraries for PAM Development"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool which \
allows system administrators to set authentication policy without \
having to recompile programs which do authentication. \
 \
This package contains header files and static libraries used for \
building both PAM-aware applications and modules for use with PAM."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-devel-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "69c3d4f7c7c3419ee4fa57aee1dc6936539a585fa6bebc3262819177f07e5c0db9ddca562ba17b55e3d35d2a1c58bb55c690332882d1d7da2765df67f0f6c102"

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
