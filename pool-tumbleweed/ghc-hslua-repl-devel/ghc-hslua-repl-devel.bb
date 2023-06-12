SUMMARY = "Haskell hslua-repl library development files"
DESCRIPTION = "This package provides the Haskell hslua-repl library development files."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-hslua-repl-devel-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "57ab7ec816a10b27de4b666f71d3724db03e56e4d34bdd5249bc70ecf6d37eb886abeca73f391717169043f65385b8e0d58045c11c4d587b40771ce9ec5ccc15"

RPROVIDES:${PN} += "ghc-devel(hslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1) \
ghc-hslua-repl-devel \
ghc-hslua-repl-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-devel(isocline-1.0.9-7x8dFWbXh69GJxYhigSqXG) \
ghc-devel(lua-2.3.1-16mGxirchUh4T3oJJYdFzu) \
ghc-devel(text-2.0.2) \
ghc-hslua-repl"

inherit rpm
