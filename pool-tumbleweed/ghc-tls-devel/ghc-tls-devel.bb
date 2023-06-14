SUMMARY = "Haskell tls library development files"
DESCRIPTION = "This package provides the Haskell tls library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-devel-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "4154d0d2b302b6e14aecc9b4290bbd2648cc17e141fbb8ceab1efbff57437f4b63c4f9130743c59327223a21f557ef85d78160e019d41a8c34a556d63be893f2"

RPROVIDES:${PN} += "ghc-devel-tls-1.6.0-48osxqPawrs8SblkErmTaM \
ghc-tls-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk \
ghc-devel-asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-devel-memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw \
ghc-devel-x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt \
ghc-devel-x509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO \
ghc-tls"

inherit rpm
