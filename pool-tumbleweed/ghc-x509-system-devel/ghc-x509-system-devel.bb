SUMMARY = "Haskell x509-system library development files"
DESCRIPTION = "This package provides the Haskell x509-system library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-devel-1.6.7-2.6.aarch64.rpm"
RPM_HASH = "fd0264e39b248961782b9320399675f4bfa04ecb1224c9d04f36c7a5c46f03c14765650d03b43ea1b5b8525fc34ac34d781b00a45238725df37c54e6116d6e92"

RPROVIDES:${PN} += "ghc-devel-x509-system-1.6.7-Bno2ph8WTqq8aOWeNLot6t \
ghc-x509-system-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-devel-process-1.6.16.0 \
ghc-devel-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-devel-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-x509-system"

inherit rpm
