SUMMARY = "Haskell cryptohash-sha256 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-devel-0.11.102.1-3.8.aarch64.rpm"
RPM_HASH = "3fb9e2edba7860d9e0ae4d29571f08da00c8a95b886f620a483e9ae9829f7bc61a835e446f6fa58ba328b5df6fadf3ec0a8de8363fc19f7cec459439e91b1034"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-devel \
ghc-devel-cryptohash-sha256-0.11.102.1-53jMaIynRosaQ7D7Mdzyr"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-sha256 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
