SUMMARY = "Haskell pem library development files"
DESCRIPTION = "This package provides the Haskell pem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-devel-0.2.4-8.8.aarch64.rpm"
RPM_HASH = "3a13f04123b58c258f463942aad71772cfa48cef4c1c5e040450002b495b575e9adb21f60ea7a593440a538d966d4b81532696ce5054f48b09336c4c5144a1a5"

RPROVIDES:${PN} += "ghc-devel-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-pem-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-pem"

inherit rpm
