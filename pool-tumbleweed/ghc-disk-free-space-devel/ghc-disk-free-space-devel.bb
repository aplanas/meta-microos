SUMMARY = "Haskell disk-free-space library development files"
DESCRIPTION = "This package provides the Haskell disk-free-space library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-devel-0.1.0.1-5.3.aarch64.rpm"
RPM_HASH = "f0a42937a1911782bb6927b26bd260dd5e3fde57e4bd572f0a9b1b68efa2e2de93ddcfdfcf8f03ef1c718b9ca33bbbf513d516f80467617bf930ee520d264d70"

RPROVIDES:${PN} += "ghc-devel-disk-free-space-0.1.0.1-3IatejMIAz9HNNNelqKH6x \
ghc-disk-free-space-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-disk-free-space"

inherit rpm
