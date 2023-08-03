SUMMARY = "PAM module to provide unprivileged cgroupfs"
DESCRIPTION = "When a user logs in, this PAM module will create cgroups which the user may \
administer, either for all controllers or for any controllers listed on the \
command line."
LICENSE = "LGPL-2.1-only"

PV = "5.0.3"

RPM_NAME = "pam_cgfs-5.0.3-1.1.aarch64.rpm"
RPM_HASH = "242057d663b8415ae736bbcc35a3537446222dfcae123d2ef05ab5e2435106bd14cdb8ac2a33d8d5f0e9a4be78ec5803ec7c9d709ca5aadb33f818c17f297240"

RPROVIDES:${PN} += "pam-cgfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1 \
libpam.so.0 \
libseccomp.so.2 \
libselinux.so.1"

inherit rpm
