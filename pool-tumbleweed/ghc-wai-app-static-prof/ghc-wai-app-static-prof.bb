SUMMARY = "Haskell wai-app-static profiling library"
DESCRIPTION = "This package provides the Haskell wai-app-static profiling library."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-prof-3.1.7.4-2.13.aarch64.rpm"
RPM_HASH = "73f28ce9c603fc2f9e840afb92d34855945e11120e39bdd7dc441184907c1dcf07ad186190649139050bae833bfcf316562672191340d313ed4e3c1ed6eb781f"

RPROVIDES:${PN} += "ghc-prof-wai-app-static-3.1.7.4-GYm23xVACFBKSbu1JkCZl2 \
ghc-wai-app-static-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-prof-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-directory-1.3.7.1 \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-http-date-0.0.11-HoNgmNPQQe1ErFjujEoPyv \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-prof-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-prof-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-wai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF \
ghc-prof-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-prof-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-wai-app-static-devel"

inherit rpm
