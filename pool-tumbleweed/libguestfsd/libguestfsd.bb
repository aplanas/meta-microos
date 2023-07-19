SUMMARY = "Daemon for the libguestfs appliance"
DESCRIPTION = "guestfsd runs within the libguestfs appliance. It receives commands from the host \
and performs the requested action by calling the helper binaries. \
This package is only required for building the appliance."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfsd-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "8f51f929c97f042f80016ae23e88828cbda7b1d689d9bda68d12b7ca10fc45a500aecd29201f4fe2f7d631754f432395b62a7ea9c66f72e74f38c36822001dcc"

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
