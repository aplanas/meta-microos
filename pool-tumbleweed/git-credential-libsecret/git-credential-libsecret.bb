SUMMARY = "Git credential backend using libsecret to access keyring"
DESCRIPTION = "A Git credential backend which uses libsecret API to acces keyrings such as \
kwallet or GNOME keyring."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-credential-libsecret-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "9e8c068b9ecbbe36689c03d333b1e90c18713782a2c6826c198fb96a0b82a40d7dd75d844058c937548b9f760e86a9afe5ca20dd5b2643fcdda91da1285a9a71"

RPROVIDES:${PN} += "git-credential-libsecret"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0"

inherit rpm
