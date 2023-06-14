SUMMARY = "Haskell cpphs profiling library"
DESCRIPTION = "This package provides the Haskell cpphs profiling library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-prof-1.20.9.1-5.3.aarch64.rpm"
RPM_HASH = "553f6b302693e76e1dbb97fdea8423cbe079483ec22c62f7d946d81220ab22dc7a3daa47740ef91ac3a58b07707f1605d0860ebd3b19146bc44e4b5a8f1f613b"

RPROVIDES:${PN} += "ghc-cpphs-prof \
ghc-prof-cpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj"

RDEPENDS:${PN} += "ghc-cpphs-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8 \
ghc-prof-time-1.12.2"

inherit rpm
