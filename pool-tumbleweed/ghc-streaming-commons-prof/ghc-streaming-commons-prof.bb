SUMMARY = "Haskell streaming-commons profiling library"
DESCRIPTION = "This package provides the Haskell streaming-commons profiling library."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-prof-0.2.2.6-1.10.aarch64.rpm"
RPM_HASH = "18b0e0d927d9f0023f46827fde6cc7ad7e9b6f823439509028380e4e2bf3db96e9042b9087248d4ca040247b97ba0ef4503fa2835238c237e56ed585930e589a"

RPROVIDES:${PN} += "ghc-prof-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-streaming-commons-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-process-1.6.17.0 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-stm-2.5.1.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-streaming-commons-devel"

inherit rpm
