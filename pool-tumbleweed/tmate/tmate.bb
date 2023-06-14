SUMMARY = "Instant terminal sharing"
DESCRIPTION = "Tmate is a fork of tmux providing an instant pairing solution."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "tmate-2.4.0-4.3.aarch64.rpm"
RPM_HASH = "385fe5f8e34603f01f1ffea23d812ba0e6d3210f127881914d4e9a641e7e03eda4d68b43623d8144b9e444e85d71b8f71c36fab34f71db8a1805cf3a4eb6b893"

RPROVIDES:${PN} += "tmate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libmsgpackc.so.2 \
libresolv.so.2 \
libssh.so.4 \
libtinfo.so.6"

inherit rpm
