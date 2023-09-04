SUMMARY = "Haskell network-bsd library development files"
DESCRIPTION = "This package provides the Haskell network-bsd library development files."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-devel-2.8.1.0-8.1.aarch64.rpm"
RPM_HASH = "1b5c0e0288287b699014a93799af8954fc58d944c2efe66f47299c4602081bd575c840b401e789ab6074c71a29bef3bcbf28b9636eaff98fbda49488e5733fb1"

RPROVIDES:${PN} += "ghc-devel-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh \
ghc-network-bsd-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-network-bsd"

inherit rpm
