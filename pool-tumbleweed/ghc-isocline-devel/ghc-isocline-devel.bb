SUMMARY = "Haskell isocline library development files"
DESCRIPTION = "This package provides the Haskell isocline library development files."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-devel-1.0.9-1.8.aarch64.rpm"
RPM_HASH = "dae5f8dba72022983f2bff0cfa164ef63a45d135b2f8273f504c67b577ad1fe4f8afd8cfb025530b574c280fcd5090149e59ca7e90686caa57d6449d17b9677a"

RPROVIDES:${PN} += "ghc-devel-isocline-1.0.9-5gDpTZgmtmsDJNf9j9fI7b \
ghc-isocline-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2 \
ghc-isocline"

inherit rpm
