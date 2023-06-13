SUMMARY = "Haskell ghc-boot profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-prof-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "9184582334d748fa28f6141448bfe74f10cbece74fb4251381d6ad8a76b04cb4a99646b7585f5741cdd21b74109855ebf726370298b6fa7f7d0813befe5ab371"

RPROVIDES:${PN} += "ghc-ghc-boot-prof \
ghc-ghc-boot-prof(aarch-64) \
ghc-prof(ghc-boot-9.4.5)"

RDEPENDS:${PN} += "ghc-ghc-boot-devel(aarch-64) \
ghc-prof(base-4.17.1.0) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(ghc-boot-th-9.4.5) \
ghc-prof(unix-2.7.3)"

inherit rpm
