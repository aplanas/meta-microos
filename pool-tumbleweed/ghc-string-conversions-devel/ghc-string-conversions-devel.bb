SUMMARY = "Haskell string-conversions library development files"
DESCRIPTION = "This package provides the Haskell string-conversions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-string-conversions-devel-0.4.0.1-3.2.aarch64.rpm"
RPM_HASH = "9815494a311e564875c47dd2a4f6b4e9c0a15b2c640a7320bf89fba0c5b89edb3208364e1207d70a5cdcc61d55bea5807ae3cf3c3031f45a965f42bc95789d88"

RPROVIDES:${PN} += "ghc-devel-string-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx \
ghc-string-conversions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-string-conversions"

inherit rpm
