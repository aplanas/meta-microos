SUMMARY = "Daemon for the libguestfs appliance"
DESCRIPTION = "guestfsd runs within the libguestfs appliance. It receives commands from the host \
and performs the requested action by calling the helper binaries. \
This package is only required for building the appliance."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfsd-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "14507e69ecee12160f2e93d4f89baed4143ffdbddac2add3aae863930ebb4fcc6d6438422b39f375d99e4ee269b6be18f7829e1bd6cd2edeead83988ce987baf"

RPROVIDES:${PN} += "guestfsd \
libguestfsd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libaugeas.so.0 \
libc.so.6 \
libcap.so.2 \
libhivex.so.0 \
libjansson.so.4 \
libm.so.6 \
libpcre2-8.so.0 \
librpm.so.9 \
libselinux.so.1 \
libtirpc.so.3"

inherit rpm
