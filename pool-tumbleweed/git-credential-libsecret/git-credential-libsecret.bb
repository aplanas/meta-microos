SUMMARY = "Git credential backend using libsecret to access keyring"
DESCRIPTION = "A Git credential backend which uses libsecret API to acces keyrings such as \
kwallet or GNOME keyring."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-credential-libsecret-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "daa41ff42a60171b5936b238edd0fc34f97ccd0c821a4e95c327db575f13cc7ccab0c1922a8b908c08c4c9178c0763e2ca220b6c16c392bbe44c014203924baa"

RPROVIDES:${PN} += "git-credential-libsecret"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0"

inherit rpm
