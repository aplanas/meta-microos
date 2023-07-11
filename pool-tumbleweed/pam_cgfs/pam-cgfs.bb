SUMMARY = "PAM module to provide unprivileged cgroupfs"
DESCRIPTION = "When a user logs in, this PAM module will create cgroups which the user may \
administer, either for all controllers or for any controllers listed on the \
command line."
LICENSE = "LGPL-2.1-only"

PV = "5.0.2"

RPM_NAME = "pam_cgfs-5.0.2-1.2.aarch64.rpm"
RPM_HASH = "eb2298007ed2fc083efb30e8fb1e89d256485ef90d3886734a25c2b4d9ab0b9f4303361a9f99610b26def976d692b03c6690e4661c5ad1ee9feab22a6a4ff8f2"

RPROVIDES:${PN} += "pam-cgfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1 \
libpam.so.0 \
libseccomp.so.2 \
libselinux.so.1"

inherit rpm
