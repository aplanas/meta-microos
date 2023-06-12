SUMMARY = "Haskell libmpd profiling library"
DESCRIPTION = "This package provides the Haskell libmpd profiling library."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-prof-0.10.0.0-2.3.aarch64.rpm"
RPM_HASH = "8debc2df70bfed5558d3ba7826155cd09db1ae8edfe87b72d82b4c6e5bee34fd5cb794af0770021cc0d8f1e8845f02c25e36920fac7174720ef8783dd65de2e1"

RPROVIDES:${PN} += "ghc-libmpd-prof \
ghc-libmpd-prof(aarch-64) \
ghc-prof(libmpd-0.10.0.0-LD6WRi8pb0r8mm5YrtyxA5)"
RDEPENDS:${PN} += "ghc-libmpd-devel \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(mtl-2.2.2) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q)"

inherit rpm
