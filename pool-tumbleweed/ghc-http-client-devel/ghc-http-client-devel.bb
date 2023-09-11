SUMMARY = "Haskell http-client library development files"
DESCRIPTION = "This package provides the Haskell http-client library development files."
LICENSE = "MIT"

PV = "0.7.14"

RPM_NAME = "ghc-http-client-devel-0.7.14-1.2.aarch64.rpm"
RPM_HASH = "eca79807f4620ba113ebc5b04666b4f78ba5beb24dcfa7d1a9a7acaf219ea7cc8b59841464fab4b020f297b2b023916d1db7e133ad7200376ecfac239db729c9"

RPROVIDES:${PN} += "ghc-devel-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-http-client-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-iproute-1.7.12-A34D1N9dJmL5ps3agDCHa7 \
ghc-devel-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-stm-2.5.1.0 \
ghc-devel-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-http-client"

inherit rpm
