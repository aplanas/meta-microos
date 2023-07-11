SUMMARY = "Haskell x509-system profiling library"
DESCRIPTION = "This package provides the Haskell x509-system profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-prof-1.6.7-2.6.aarch64.rpm"
RPM_HASH = "4e9df68dfdcb85105c87fd4b0be6e589b460209edc8a54fc6cf1b9dff97ab857619e49deffc2590a4e04ce9c59337392e4f87d067a7cdd6e80eaec8d55a5a913"

RPROVIDES:${PN} += "ghc-prof-x509-system-1.6.7-Bno2ph8WTqq8aOWeNLot6t \
ghc-x509-system-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-prof-process-1.6.16.0 \
ghc-prof-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-prof-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-x509-system-devel"

inherit rpm
