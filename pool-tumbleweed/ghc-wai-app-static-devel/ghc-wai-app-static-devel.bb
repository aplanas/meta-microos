SUMMARY = "Haskell wai-app-static library development files"
DESCRIPTION = "This package provides the Haskell wai-app-static library development files."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-devel-3.1.7.4-2.12.aarch64.rpm"
RPM_HASH = "2bbd1ac4ccd0ce27ffe06395233668a7cca1a38bdaac1352ae48935c9f12ddfe7dba22ef96f312e37d9b4b3231d6bf25d0e6141dd8e42fd9943eb01d3d35d4da"

RPROVIDES:${PN} += "ghc-devel-wai-app-static-3.1.7.4-4gPGtaPPrElL5voDUXdKV2 \
ghc-wai-app-static-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-devel-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-directory-1.3.7.1 \
ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-http-date-0.0.11-HoNgmNPQQe1ErFjujEoPyv \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-devel-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-devel-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF \
ghc-devel-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-devel-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-wai-app-static"

inherit rpm
