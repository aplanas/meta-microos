SUMMARY = "Haskell network profiling library"
DESCRIPTION = "This package provides the Haskell network profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-prof-3.1.4.0-2.3.aarch64.rpm"
RPM_HASH = "ef681bd628e6c0f635ad704ef701111cf7f8f4db6b6806ddc6cffb9832e511440b7ed57c5cddda8e3c49f2171fa813fe4e64ce7111ae672b784c728656176536"

RPROVIDES:${PN} += "ghc-network-prof \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs"

RDEPENDS:${PN} += "ghc-network-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1"

inherit rpm
