SUMMARY = "Simple multicast library"
DESCRIPTION = "The 'Network.Multicast' module is for sending UDP datagrams over multicast \
(class D) addresses."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-0.3.2-4.2.aarch64.rpm"
RPM_HASH = "cb8c17be316c912e6931ff56e8fb8732025512349a96b35ba714898afdb9ff9c523e50050a16667c70348e9470234c29884236d8111d2ea84313c0f777bd550e"

RPROVIDES:${PN} += "ghc-network-multicast \
ghc-network-multicast(aarch-64) \
libHSnetwork-multicast-0.3.2-GrPQCwnsCBBDUXDpEy9gVm-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) \
libHSnetwork-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
