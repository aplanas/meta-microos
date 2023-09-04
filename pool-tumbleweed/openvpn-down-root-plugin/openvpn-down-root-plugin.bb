SUMMARY = "OpenVPN down-root plugin"
DESCRIPTION = "The OpenVPN down-root plugin allows an OpenVPN configuration to call a \
down script with root privileges, even when privileges have been \
dropped using --user/--group/--chroot. \
 \
This module uses a split privilege execution model which will fork() \
before OpenVPN drops root privileges, at the point where the --up \
script is usually called.  The plugin will then remain in a wait state \
until it receives a message from OpenVPN via pipe to execute the down \
script.  Thus, the down script will be run in the same execution \
environment as the up script."
LICENSE = "GPL-2.0-only-with-openvpn-openssl-exception"

PV = "2.6.6"

RPM_NAME = "openvpn-down-root-plugin-2.6.6-1.1.aarch64.rpm"
RPM_HASH = "34099cbce701c9ca3f8ff0483101758ee589e114a764e764fc0fa74ab464c48ed699cc77aba826ab1597f7d74d0c2a87d24a9b7008a0e96b048f8c562fc5897c"

RPROVIDES:${PN} += "openvpn-down-root-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
openvpn"

inherit rpm
