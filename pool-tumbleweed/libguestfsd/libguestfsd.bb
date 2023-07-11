SUMMARY = "Daemon for the libguestfs appliance"
DESCRIPTION = "guestfsd runs within the libguestfs appliance. It receives commands from the host \
and performs the requested action by calling the helper binaries. \
This package is only required for building the appliance."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfsd-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "0b6ef63f70f35fb61b2535f6390c4e7fd8134b90f411f5852989701c0976526b21dfb9d92214f105d72ea4656256566e46320cf0559e1588226b7e570a26bc27"

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
