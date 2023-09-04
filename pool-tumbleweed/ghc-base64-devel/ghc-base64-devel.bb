SUMMARY = "Haskell base64 library development files"
DESCRIPTION = "This package provides the Haskell base64 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-devel-0.4.2.4-3.9.aarch64.rpm"
RPM_HASH = "cedf1402dce15639aab4760f1bb68129d3c7fb67d52def76c4f579e6282ce1b86f8d82309ec4b12e0a7ded6c5985df3363b96b28e67e1d90cefa4a85546d0702"

RPROVIDES:${PN} += "ghc-base64-devel \
ghc-devel-base64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base64 \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-text-2.0.2 \
ghc-devel-text-short-0.1.5-1JafpcPTh6A5I5aikDr3ez"

inherit rpm
