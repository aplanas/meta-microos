SUMMARY = "Haskell gitrev profiling library"
DESCRIPTION = "This package provides the Haskell gitrev profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-prof-1.3.1-9.2.aarch64.rpm"
RPM_HASH = "65bcb709aca35e70404502a156a8dd951307b663c23801c310b69f79026a6edcaf51002248d4775d816ea941fb6d6d31564d487acb412ab5e26d72a88c6e4a75"

RPROVIDES:${PN} += "ghc-gitrev-prof \
ghc-gitrev-prof(aarch-64) \
ghc-prof(gitrev-1.3.1-Fh7rxVehK3vCpE8f2RFTGz)"
RDEPENDS:${PN} += "ghc-gitrev-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(process-1.6.16.0) \
ghc-prof(template-haskell-2.19.0.0)"

inherit rpm
