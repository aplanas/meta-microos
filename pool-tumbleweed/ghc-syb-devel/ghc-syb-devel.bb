SUMMARY = "Haskell syb library development files"
DESCRIPTION = "This package provides the Haskell syb library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.2.3"

RPM_NAME = "ghc-syb-devel-0.7.2.3-1.2.aarch64.rpm"
RPM_HASH = "3285f0061727035abff9c924d628eb18471d6e6f06cab7c9ea89d97528dd06d0fd325bb0f818c0ef9d052b1b5da743178060e6c7b5a29b247a6d890303a4d763"

RPROVIDES:${PN} += "ghc-devel(syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i) \
ghc-syb-devel \
ghc-syb-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-syb"

inherit rpm
