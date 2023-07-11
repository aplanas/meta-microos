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

PV = "2.6.5"

RPM_NAME = "openvpn-down-root-plugin-2.6.5-1.1.aarch64.rpm"
RPM_HASH = "b0ec779f48414ba980058002404bbf6856461e8ffd02b9b66664de7e176d1ad2fd98842f4051c85019d0bebe902c3d68dfaac23a3819bf29e30fe1bcfbc9260e"

RPROVIDES:${PN} += "openvpn-down-root-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
openvpn"

inherit rpm
