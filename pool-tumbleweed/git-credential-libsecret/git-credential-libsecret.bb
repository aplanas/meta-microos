SUMMARY = "Git credential backend using libsecret to access keyring"
DESCRIPTION = "A Git credential backend which uses libsecret API to acces keyrings such as \
kwallet or GNOME keyring."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-credential-libsecret-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "baffbc4092135695acb2836ac299b9b9c0459ecdbc1c624fe7210354ed2b7c7a3efaabf476f90fd624557c12aed6c21b1efa82314dae8aa9300948bfc27dc177"

RPROVIDES:${PN} += "git-credential-libsecret"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0"

inherit rpm
