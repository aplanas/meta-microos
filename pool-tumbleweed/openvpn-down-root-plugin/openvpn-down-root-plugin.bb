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
LICENSE = "GPL-2.0-only-WITH-openvpn-openssl-exception"

PV = "2.6.4"

RPM_NAME = "openvpn-down-root-plugin-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "1cbc0768b26be1d632ebb9ea2006b7e72c8a13224fc405fead3a9b78b0e5bd526019ed6a1582ac831873cc20ddd2778e0af7ed61b13eb6fca77bc53536fe5d4f"

RPROVIDES:${PN} += "openvpn-down-root-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
openvpn"

inherit rpm
