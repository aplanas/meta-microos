SUMMARY = "Haskell entropy profiling library"
DESCRIPTION = "This package provides the Haskell entropy profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-prof-0.4.1.10-3.2.aarch64.rpm"
RPM_HASH = "edc9b19cbab5696844596fd0c98668a884ecdba64e85b1334335b71e515731fd8773652c715704200df06f7f95d4ace7faa8e0458730c2b8de732e9d5de187be"

RPROVIDES:${PN} += "ghc-entropy-prof \
ghc-entropy-prof(aarch-64) \
ghc-prof(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP)"
RDEPENDS:${PN} += "ghc-entropy-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(unix-2.7.3)"

inherit rpm
