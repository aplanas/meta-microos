SUMMARY = "Haskell hslua-module-text library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-text library development \
files."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-text-devel-1.1.0.1-1.2.aarch64.rpm"
RPM_HASH = "b9e01e441d21dd08389ddbee92b9c15e9389246c620c7042d9077dd436de5f9cd4956b1b600376bf96a8273491967891ddf8db9caa733ca518d5d935764fb079"

RPROVIDES:${PN} += "ghc-devel-hslua-module-text-1.1.0.1-EvPw7u7E7fn9ZAp58nb6qh \
ghc-hslua-module-text-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-devel-hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4 \
ghc-devel-text-2.0.2 \
ghc-hslua-module-text"

inherit rpm
