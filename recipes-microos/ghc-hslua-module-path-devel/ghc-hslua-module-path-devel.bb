SUMMARY = "Haskell hslua-module-path library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-path library development \
files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-path-devel-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "3ae47ae7b378e092a060844c3b1ff7a2b0eb29517e2bd8cee593a41c25cd7ce26d572d51550b4a7d00de329adac55cc2adb48756a6205492fccc4d4302b11ab0"

RPROVIDES:${PN} += "ghc-devel(hslua-module-path-1.1.0-H35lL8Cos84Ew14x3WsMMD) \
ghc-hslua-module-path-devel \
ghc-hslua-module-path-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-devel(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) \
ghc-devel(text-2.0.2) \
ghc-hslua-module-path"

inherit rpm
