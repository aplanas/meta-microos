SUMMARY = "Git credential backend using the GNOME keyring as storage"
DESCRIPTION = "A Git credential backend which uses the GNOME keyring as storage."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-credential-gnome-keyring-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "33dbae2dfcf834b210c77c74276a653cad435461525ef72c98757fbe048abaa48d7df54ffc46f6a2f18816755c410fb0c79b68b93bc16cf948cdf5a60cb0518b"

RPROVIDES:${PN} += "git-credential-gnome-keyring"

RDEPENDS:${PN} += "git-core \
gnome-keyring \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnome-keyring.so.0"

inherit rpm
