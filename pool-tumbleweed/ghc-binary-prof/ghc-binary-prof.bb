SUMMARY = "Haskell binary profiling library"
DESCRIPTION = "This package provides the Haskell binary profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-prof-0.8.9.1-3.2.aarch64.rpm"
RPM_HASH = "6ce30a3c87f9ae1153693850dc8393d192ec66577e541c611dad07f808f7a683c7914b185b2c36c09e9975aad58ac3c2d0082ce0c0b940dd0e377f819301bc9b"

RPROVIDES:${PN} += "ghc-binary-prof \
ghc-prof-binary-0.8.9.1"

RDEPENDS:${PN} += "ghc-binary-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7"

inherit rpm
