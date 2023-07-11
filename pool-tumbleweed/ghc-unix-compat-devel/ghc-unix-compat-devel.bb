SUMMARY = "Haskell unix-compat library development files"
DESCRIPTION = "This package provides the Haskell unix-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-devel-0.6-3.6.aarch64.rpm"
RPM_HASH = "7de695bc3902fc14b5e4bf5d52a9c06f4bcc76fd5f75b676cdd2ac44aa4708337567fc707ad9e78aa00f793a4730ee2902e1a7a5076503822bd28cef212d3988"

RPROVIDES:${PN} += "ghc-devel-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-unix-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-unix-2.7.3 \
ghc-unix-compat"

inherit rpm
