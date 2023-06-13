SUMMARY = "Haskell email-validate profiling library"
DESCRIPTION = "This package provides the Haskell email-validate profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.18"

RPM_NAME = "ghc-email-validate-prof-2.3.2.18-2.2.aarch64.rpm"
RPM_HASH = "bea4453dc8a22cf378c7f41a99a9e5facc976e1c6363029e7ec85257c43c2a39d551291dd378c287c5d2a1b38502242e9d67cc1c30c30215f6c2ef92181d5e11"

RPROVIDES:${PN} += "ghc-email-validate-prof \
ghc-email-validate-prof(aarch-64) \
ghc-prof(email-validate-2.3.2.18-8MZFHS3GPuQLNTYP4EPLHD)"

RDEPENDS:${PN} += "ghc-email-validate-devel \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(template-haskell-2.19.0.0)"

inherit rpm
