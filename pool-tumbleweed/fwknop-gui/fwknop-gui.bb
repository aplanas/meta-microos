SUMMARY = "FireWall KNock OPerator Graphical User Interface"
DESCRIPTION = "The FireWall KNock OPerator implements an authorization scheme called \
Single Packet Authorization (SPA), based on Netfilter and libpcap. \
 \
Its main application is to protect services such as OpenSSH with an \
additional layer of security in order to make the exploitation of \
vulnerabilities (both 0-day and unpatched code) much more difficult. \
 \
Fwknop GUI is a graphical user interface integrated with an Fwknop \
client that provides the ability to send SPA packets to a remote \
Fwknop server, as well as a front-end for creating and managing client \
configurations for multiple Fwknop servers. \
 \
It supports exporting saved configuration data to a QR code format \
readable by the Android client, as well as to the .fwknoprc format \
readable by the command line client."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "fwknop-gui-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "0c2d22e97ffd729d01fefdb61c54d7ae6dbd29844b7e0a0171eef42b9d96b3f86c1674574c5dc190692a5ec69addb96786aebabae318b3a981a6cb980a231536"

RPROVIDES:${PN} += "fwknop-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfko.so.3 \
libgcc-s.so.1 \
libgpgme.so.11 \
libqrencode.so.4 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0"

inherit rpm
