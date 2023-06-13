SUMMARY = "Daemon for the libguestfs appliance"
DESCRIPTION = "guestfsd runs within the libguestfs appliance. It receives commands from the host \
and performs the requested action by calling the helper binaries. \
This package is only required for building the appliance."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfsd-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "545cbf00565b560d22d9949ba615e752802d2fc255b58eba23b7e1a783e7ca2fd92087dc3d7669f9b0a0a1ee9703189e7e0394b18062d77cba4d24ce2731efe8"

RPROVIDES:${PN} += "guestfsd \
libguestfsd \
libguestfsd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libacl.so.1()(64bit) \
libaugeas.so.0()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libhivex.so.0()(64bit) \
libjansson.so.4()(64bit) \
libm.so.6()(64bit) \
libpcre2-8.so.0()(64bit) \
librpm.so.9()(64bit) \
libselinux.so.1()(64bit) \
libtirpc.so.3()(64bit)"

inherit rpm
