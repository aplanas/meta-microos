SUMMARY = "Extra RPM macros for building Haskell packages with several libs"
DESCRIPTION = "Extra macros used for subpackaging of Haskell libraries, \
for example in ghc and haskell-platform."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.2"

RPM_NAME = "ghc-rpm-macros-extra-2.5.2-1.1.noarch.rpm"
RPM_HASH = "a1132246af80a8581dd5ac90347d9852a23a02c2207de0572311cba3f1e66ec0ba61e31d42633f3f9ee6c763bdb8edefc77194be5ecd02c4dfe3512c8e771b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-rpm-macros-extra \
rpm-macro-ghc-lib-subpackage \
rpm-macro-ghc-libs-build \
rpm-macro-ghc-libs-install"

RDEPENDS:${PN} += "ghc-rpm-macros"

inherit rpm
