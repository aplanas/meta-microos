SUMMARY = "Extra RPM macros for building Haskell packages with several libs"
DESCRIPTION = "Extra macros used for subpackaging of Haskell libraries, \
for example in ghc and haskell-platform."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.3"

RPM_NAME = "ghc-rpm-macros-extra-2.5.3-1.1.noarch.rpm"
RPM_HASH = "c619b0e03e500d9063d27563b2be54ac4e973aa5b8af7b3a36a949928ee1a21c3af73a2639e0b11aaf29e0ae119ff843e540ca18ea64f6304be47b9a2b313844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-rpm-macros-extra \
rpm-macro-ghc-lib-subpackage \
rpm-macro-ghc-libs-build \
rpm-macro-ghc-libs-install"

RDEPENDS:${PN} += "ghc-rpm-macros"

inherit rpm
