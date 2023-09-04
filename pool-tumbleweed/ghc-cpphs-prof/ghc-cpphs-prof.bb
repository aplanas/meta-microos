SUMMARY = "Haskell cpphs profiling library"
DESCRIPTION = "This package provides the Haskell cpphs profiling library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-prof-1.20.9.1-5.8.aarch64.rpm"
RPM_HASH = "909cae3c5addcdcafc23f7c45f472dac22d7f13a7fd265b8fe6a59bd457574e8b4a308374cd78e5afca7f9aa635a35a66443a2bc8deb8d1d5ec84560a3a86a5e"

RPROVIDES:${PN} += "ghc-cpphs-prof \
ghc-prof-cpphs-1.20.9.1-21Hm230EH4MCmgim8IB00q"

RDEPENDS:${PN} += "ghc-cpphs-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-polyparse-1.13-BLB26XAC1GDzZMBJpPaUe \
ghc-prof-time-1.12.2"

inherit rpm
