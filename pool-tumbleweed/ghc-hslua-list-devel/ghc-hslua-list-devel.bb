SUMMARY = "Haskell hslua-list library development files"
DESCRIPTION = "This package provides the Haskell hslua-list library development files."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-devel-1.1.1-2.5.aarch64.rpm"
RPM_HASH = "44aef24b6f6f21c29e6505a6d4296f9753b0ca7186984c48d237e95d3815741300b5cee5e5bfc72a82f1293dd303e39d8ead0bf52efe7c0c03dc3960f54171ef"

RPROVIDES:${PN} += "ghc-devel-hslua-list-1.1.1-2YSx4pSaGRhHpPDWFYeDXu \
ghc-hslua-list-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-hslua-list"

inherit rpm
