SUMMARY = "Haskell emojis profiling library"
DESCRIPTION = "This package provides the Haskell emojis profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-emojis-prof-0.1.2-2.2.aarch64.rpm"
RPM_HASH = "e81e5ec0e3c0442b00a918d38981d7f8fb49e7fc4733b2c8919c8ff8c01aca788067503eb04830cf5e4182712338d99923fcaafdc5b4986c47aec4075cef07f3"

RPROVIDES:${PN} += "ghc-emojis-prof \
ghc-emojis-prof(aarch-64) \
ghc-prof(emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm)"

RDEPENDS:${PN} += "ghc-emojis-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(text-2.0.2)"

inherit rpm
