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

RPM_NAME = "biboumi-9.0-4.5.aarch64.rpm"
RPM_HASH = "c5582883d70e63d72d8002d47540d32371f4e2a21b22f862035313e8e2e367bbb8e054f9df26d9f285ee947b24b3687712d9fba4ebfdd71f7abf8b354c215b19"

RPROVIDES:${PN} += "biboumi \
config-biboumi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbotan-2.so.19 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libidn.so.12 \
libpq.so.5 \
libsqlite3.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libudns.so.0 \
libuuid.so.1"

inherit rpm
