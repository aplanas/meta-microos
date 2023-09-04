SUMMARY = "Haskell data-clist library development files"
DESCRIPTION = "This package provides the Haskell data-clist library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-devel-0.2-2.3.aarch64.rpm"
RPM_HASH = "42825ed05a0c5c88e26fe279d746a7737e2538ea6a26ee1ad411bb26edc27d087732c756fad2f023e9cac9344d3e911bcc18c7dcaaa419c28617179a5cd2effa"

RPROVIDES:${PN} += "ghc-data-clist-devel \
ghc-devel-data-clist-0.2-2XS2LK92Ow8274ZzRlQjKH"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-clist \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
