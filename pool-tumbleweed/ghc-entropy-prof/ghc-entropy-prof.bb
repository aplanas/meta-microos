SUMMARY = "Haskell entropy profiling library"
DESCRIPTION = "This package provides the Haskell entropy profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-prof-0.4.1.10-3.4.aarch64.rpm"
RPM_HASH = "3db88733e039bfd89c92bc5fcc51c60148effc7d1745ae8d85aca6c736b234f468e8d2c6eaca7eacc0c5cb1955277be6552eeec25fd62ca18e79030141d39906"

RPROVIDES:${PN} += "ghc-entropy-prof \
ghc-prof-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc"

RDEPENDS:${PN} += "ghc-entropy-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-unix-2.7.3"

inherit rpm
