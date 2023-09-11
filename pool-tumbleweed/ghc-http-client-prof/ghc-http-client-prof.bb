SUMMARY = "Haskell http-client profiling library"
DESCRIPTION = "This package provides the Haskell http-client profiling library."
LICENSE = "MIT"

PV = "0.7.14"

RPM_NAME = "ghc-http-client-prof-0.7.14-1.2.aarch64.rpm"
RPM_HASH = "2ccf786bb88e7a66b6ff8850cb40978248799c1b07f3bdee110700c53af5f257a3919b1cc686ec87b36027f0b356f3aa9355d629ec03a6fac0b7e4153cd88f47"

RPROVIDES:${PN} += "ghc-http-client-prof \
ghc-prof-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe"

RDEPENDS:${PN} += "ghc-http-client-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-iproute-1.7.12-A34D1N9dJmL5ps3agDCHa7 \
ghc-prof-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-stm-2.5.1.0 \
ghc-prof-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
