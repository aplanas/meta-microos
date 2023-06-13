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

PV = "0.4.7.13"

RPM_NAME = "tor-0.4.7.13-2.3.aarch64.rpm"
RPM_HASH = "0fd4029df7aeadc8d007cdd8f44f20fe63eec1352831790b39ac879a71e5ee68fcb5b1d382badf3adf5cb0391f6a1828e59c7fce977c892e00b980bb5c88e601"

RPROVIDES:${PN} += "config(tor) \
tor \
tor(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libevent-2.1.so.7()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libscrypt.so.0()(64bit) \
libscrypt.so.0(libscrypt)(64bit) \
libssl.so.3()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
logrotate"

inherit rpm
