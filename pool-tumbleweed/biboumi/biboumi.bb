SUMMARY = "XMPP to IRC gateway"
DESCRIPTION = "Biboumi is an XMPP gateway that connects to IRC servers and \
translates between the two protocols. XMPP users can take part in IRC \
discussions, using their favourite XMPP client. \
 \
It provides the following features: \
 \
 * Connection from an unlimited number of XMPP users to an unlimited number of IRC servers \
 * Persistent connections to a configured list of channels, making it behave as an IRC bouncer \
 * Basic channel features: join, part, view and set the topic, view and set channel or user modes, kick, nick change… \
 * Private conversations \
 * Notices \
 * Invitations \
 * IRC colors (receive only) \
 * TLS connections to IRC servers \
 * Channel listing \
 * CTCP version and ping \
 * Dynamic per-user, per-server configuration using XMPP ad-hoc commands and data-forms \
 * Automatic sending of a command on connection (mostly used to send an identify message to NickServ or other authentication services) \
 * Support for sending arbitrary IRC commands to a server \
 * Embedded identd server \
 * Message Archive Management support"
LICENSE = "Zlib"

PV = "9.0"

RPM_NAME = "biboumi-9.0-4.4.aarch64.rpm"
RPM_HASH = "c2273468271cba1929a6bc0b0a01611422e3034e98cfece14f48567819dd19e21fd16470dcbdb2b02b037ac78dd9e37b3b609306bd120d142fd81978938766f1"

RPROVIDES:${PN} += "biboumi \
biboumi(aarch-64) \
config(biboumi)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libbotan-2.so.19()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libidn.so.12()(64bit) \
libpq.so.5()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libudns.so.0()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
