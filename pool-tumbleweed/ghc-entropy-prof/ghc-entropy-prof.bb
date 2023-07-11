SUMMARY = "Haskell entropy profiling library"
DESCRIPTION = "This package provides the Haskell entropy profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-prof-0.4.1.10-3.3.aarch64.rpm"
RPM_HASH = "ced3ef3993a94fb37f2870aa3a9055e165bea2c4e23b8d160edeaca3c22c795c200a12ffc5faf9409751c7fa2854111a720ff11f5409103428ca42d793eb401b"

RPROVIDES:${PN} += "ghc-entropy-prof \
ghc-prof-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP"

RDEPENDS:${PN} += "ghc-entropy-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-unix-2.7.3"

inherit rpm
