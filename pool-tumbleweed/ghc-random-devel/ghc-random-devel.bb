SUMMARY = "Haskell random library development files"
DESCRIPTION = "This package provides the Haskell random library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.1"

RPM_NAME = "ghc-random-devel-1.2.1.1-2.2.aarch64.rpm"
RPM_HASH = "b934515bccf94be150cee79b7fb4e15bcdcfa8ed8447fcc89daecb0eb18211bcfd0291d03e8df1b83262847665795a94d1bbb300f50ecef9ecee9745244b765d"

RPROVIDES:${PN} += "ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-random-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe \
ghc-random"

inherit rpm
