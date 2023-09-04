SUMMARY = "Haskell boring library development files"
DESCRIPTION = "This package provides the Haskell boring library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-boring-devel-0.2.1-1.4.aarch64.rpm"
RPM_HASH = "69ca060c3f9e032101d1cb9a3b10e6eb2243e1fddedf90df528f2933d02ac9281b9aac7f9ae98c9a2f48c941e0fa1f06b629ed582a0da4fcbc7e565fbc89ca45"

RPROVIDES:${PN} += "ghc-boring-devel \
ghc-devel-boring-0.2.1-8UoR96J8uAp13B13xTdCnI"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-boring \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2"

inherit rpm
