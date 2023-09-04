SUMMARY = "Haskell cpphs library development files"
DESCRIPTION = "This package provides the Haskell cpphs library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-devel-1.20.9.1-5.8.aarch64.rpm"
RPM_HASH = "4fedebf574f602afd2c65d4b62a091119c42ea34c7ef0e0b5017a7439df9623ff97a70ecc743174fc51a0c37c6c1c39cfd634b73469df2ad2bbe12469c5df2a9"

RPROVIDES:${PN} += "ghc-cpphs-devel \
ghc-devel-cpphs-1.20.9.1-21Hm230EH4MCmgim8IB00q"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cpphs \
ghc-devel-base-4.17.2.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-polyparse-1.13-BLB26XAC1GDzZMBJpPaUe \
ghc-devel-time-1.12.2"

inherit rpm
