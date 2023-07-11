SUMMARY = "Pipe support for the Courier authentication library"
DESCRIPTION = "This package installs Pipe support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
Pipe."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-pipe-0.72.0-1.5.aarch64.rpm"
RPM_HASH = "f80c02b9577af6a457d655e5a712e0731c51999ab520bcc91ebc0d748cb0bfa5bd3b3f5ac0be78314fbdeb5db1982f244bd73057eed71bd778fd9c6d7e9b5d3e"

RPROVIDES:${PN} += "courier-authlib-pipe \
libauthpipe.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcourierauth.so.0"

inherit rpm
