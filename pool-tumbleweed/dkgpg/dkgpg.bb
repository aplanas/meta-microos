SUMMARY = "Distributed Key Generation (DKG) and Threshold Cryptography for OpenPGP"
DESCRIPTION = "The Distributed Privacy Guard (DKGPG) implements Distributed Key \
Generation (DKG) and Threshold Cryptography for OpenPGP. The \
generated public keys are RFC4880 compatible and can be used by e.g. \
GnuPG. The main purpose of this software is distributing power among \
multiple parties, eliminating single points of failure, and \
increasing the difficulty of side-channel attacks on private key \
material. \
 \
DKGPG consists of a number of command-line programs. The current implementation \
is in experimental state and should NOT be used in production environments. \
 \
A shared private key and a common public key (currently only \
DSA/ElGamal) are generated. Further interactive protocols perform the \
private operations like decryption and signing of files, provided \
that a previously defined threshold of parties/devices take part in \
the distributed computation. Due to the interactiveness of the \
protocols, a lot of messages between participating parties have to be \
exchanged in a secure way. GNUnet's mesh-routed CADET srvice is used \
to establish private and broadcast channels for this message \
exchange. A TCP/IP-based service is included as an alternative. It \
may be combined with torsocks and NAT of a local hidden service."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "dkgpg-1.1.3-1.16.aarch64.rpm"
RPM_HASH = "5c6f84cd336deceadb11ae193298adcbd788d31a536643f0bfca79fe2c6e19fad9b69f7369af962d1f9178f44d48305d9533e42ff9e861654ee5fb27c9ef8e01"

RPROVIDES:${PN} += "dkgpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libTMCG.so.18 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgmp.so.10 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
