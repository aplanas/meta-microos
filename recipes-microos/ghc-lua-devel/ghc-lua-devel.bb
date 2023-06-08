SUMMARY = "Haskell lua library development files"
DESCRIPTION = "This package provides the Haskell lua library development files."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-devel-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "5e3f7ece7f9d43b0e885535c441d2471805f12245ab6533b8ca7c85ddd310135491d2a44ddba6cf92b2274cb21014eab42f2580f8dd0df74a614c68ffbd1f6cc"

RPROVIDES:${PN} += "ghc-devel(lua-2.3.1-16mGxirchUh4T3oJJYdFzu) ghc-lua-devel ghc-lua-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-lua"

inherit rpm
