SUMMARY = "GNOME system keyring plugin for Purple"
DESCRIPTION = "After the plugin is enabled, whenever an account with a pidgin-stored \
password signs on, its password will automatically be saved to the \
keyring and removed from the plaintext accounts.xml file."
LICENSE = "GPL-2.0+"

PV = "2.0"

RPM_NAME = "libpurple-plugin-gnome-keyring-2.0-1.23.aarch64.rpm"
RPM_HASH = "f0d97ced18e7763fef866991fcffcf9100b07aac771ec048b21c2fa1239529584238048e597bc17e6301db33fee60a613c920f4a81fd3efb0fa360a6c34580c3"

RPROVIDES:${PN} += "libpurple-plugin-gnome-keyring"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libsecret-1.so.0"

inherit rpm
