SUMMARY = "Instant terminal sharing"
DESCRIPTION = "Tmate is a fork of tmux providing an instant pairing solution."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "tmate-2.4.0-4.3.aarch64.rpm"
RPM_HASH = "385fe5f8e34603f01f1ffea23d812ba0e6d3210f127881914d4e9a641e7e03eda4d68b43623d8144b9e444e85d71b8f71c36fab34f71db8a1805cf3a4eb6b893"

RPROVIDES:${PN} += "tmate \
tmate(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevent-2.1.so.7()(64bit) \
libmsgpackc.so.2()(64bit) \
libresolv.so.2()(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
libssh.so.4(LIBSSH_4_7_0)(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
