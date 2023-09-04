SUMMARY = "Haskell easy-file profiling library"
DESCRIPTION = "This package provides the Haskell easy-file profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-prof-0.2.5-1.5.aarch64.rpm"
RPM_HASH = "f0fb913cd2cd6574ec4e2803d572a6d7b587218db8dee917f08b07a883fceb9f5c532a2c5950764aa73cd47b92bbf452057977b5e517b397aab60ca86ab9c14c"

RPROVIDES:${PN} += "ghc-easy-file-prof \
ghc-prof-easy-file-0.2.5-IptebCGkAyyEfjLBFFjLI"

RDEPENDS:${PN} += "ghc-easy-file-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3"

inherit rpm
