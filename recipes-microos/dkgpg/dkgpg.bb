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

RPM_NAME = "dkgpg-1.1.3-1.15.aarch64.rpm"
RPM_HASH = "16900b4eadd4e3ed23495ba929b1061ce145087f22a4de1cdf9b1c3d39050023355d3981fe7b9bc9e317292f5ce02acd71e24033e9c6cc3cff485d02eaabacce"

RPROVIDES:${PN} += "dkgpg \
dkgpg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libTMCG.so.18()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgmp.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
