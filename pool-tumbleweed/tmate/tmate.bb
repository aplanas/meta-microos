SUMMARY = "Instant terminal sharing"
DESCRIPTION = "Tmate is a fork of tmux providing an instant pairing solution."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "tmate-2.4.0-4.4.aarch64.rpm"
RPM_HASH = "29035bea0f57311ce6d1de5785529411a04b88d91dbc15029a4acaa66a7a86a2130a50ee46dd3ad7049293f93913bf4c77422c1d6e72bb0fb930112bee3f660a"

RPROVIDES:${PN} += "tmate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libmsgpackc.so.2 \
libresolv.so.2 \
libssh.so.4 \
libtinfo.so.6"

inherit rpm
