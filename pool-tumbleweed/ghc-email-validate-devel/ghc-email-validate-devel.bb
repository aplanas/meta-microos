SUMMARY = "Haskell email-validate library development files"
DESCRIPTION = "This package provides the Haskell email-validate library development files."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.18"

RPM_NAME = "ghc-email-validate-devel-2.3.2.18-2.2.aarch64.rpm"
RPM_HASH = "70ed4cc56d72b1e2722b4cd5362e00a5d4b52283992b2d89bd73d883f72501b31247dd84295a3b91961c402a10c703a9e66f90bfa75b64556c1c749919fce05a"

RPROVIDES:${PN} += "ghc-devel-email-validate-2.3.2.18-8MZFHS3GPuQLNTYP4EPLHD \
ghc-email-validate-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-email-validate"

inherit rpm
