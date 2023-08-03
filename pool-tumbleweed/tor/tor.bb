SUMMARY = "Anonymizing overlay network for TCP (The onion router)"
DESCRIPTION = "Tor is a connection-based low-latency anonymous communication system. \
 \
This package provides the 'tor' program, which serves as both a client and \
a relay node. Scripts will automatically create a 'tor' user and \
a 'tor' group, and set tor up to run as a daemon when the system \
is rebooted. \
 \
Applications connect to the local Tor proxy using the SOCKS \
protocol. The tor client chooses a path through a set of relays, in \
which each relay knows its predecessor and successor, but no \
others. Traffic flowing down the circuit is unwrapped by a symmetric \
key at each relay, which reveals the downstream relay. \
 \
Warnings: Tor does no protocol cleaning.  That means there is a danger \
that application protocols and associated programs can be induced to \
reveal information about the initiator. Tor depends on Privoxy or \
similar protocol cleaners to solve this problem. This is alpha code, \
and is even more likely than released code to have anonymity-spoiling \
bugs. The present network is small -- this further reduces the \
strength of the anonymity provided. Tor is not presently suitable \
for high-stakes anonymity."
LICENSE = "BSD-3-Clause"

PV = "0.4.7.14"

RPM_NAME = "tor-0.4.7.14-1.1.aarch64.rpm"
RPM_HASH = "ebc82c125da9858689c6c1c78d26302ad5b0f49198dd194254fb4474bb11548811cb74b6c94f4de8dcae1b7f28ba575b05d0bc1732ad68b36d8629f12d33cd18"

RPROVIDES:${PN} += "config-tor \
tor"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libevent-2.1.so.7 \
liblzma.so.5 \
libm.so.6 \
libscrypt.so.0 \
libssl.so.3 \
libsystemd.so.0 \
libz.so.1 \
libzstd.so.1 \
logrotate"

inherit rpm
