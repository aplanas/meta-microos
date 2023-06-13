SUMMARY = "Haskell concurrent-output library development files"
DESCRIPTION = "This package provides the Haskell concurrent-output library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.10.17"

RPM_NAME = "ghc-concurrent-output-devel-1.10.17-2.3.aarch64.rpm"
RPM_HASH = "b62dcf9d657d1e54e0876f2045607a5f46239f3f51e2731d20b583249103db5f66a1b7faaa34858d16677e5ac0544bff380a3f496bfc281943db90ee0d479584"

RPROVIDES:${PN} += "ghc-concurrent-output-devel \
ghc-concurrent-output-devel(aarch-64) \
ghc-devel(concurrent-output-1.10.17-8XvoUl0e7ll2y9NMBdkV0e)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-concurrent-output \
ghc-devel(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-devel(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) \
ghc-devel(base-4.17.1.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(process-1.6.16.0) \
ghc-devel(stm-2.5.1.0) \
ghc-devel(terminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-2.7.3)"

inherit rpm
