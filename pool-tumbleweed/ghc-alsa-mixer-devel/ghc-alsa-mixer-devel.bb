SUMMARY = "Haskell alsa-mixer library development files"
DESCRIPTION = "This package provides the Haskell alsa-mixer library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-alsa-mixer-devel-0.3.0-4.3.aarch64.rpm"
RPM_HASH = "a0617f69bea061b38c78bdf0f37ba1792606e9e80a1dbcba201116523b976d36d4350d67af873499aac1399fbf37ece0d6010ed10163bcda46c6c576e5ae82c1"

RPROVIDES:${PN} += "ghc-alsa-mixer-devel \
ghc-devel-alsa-mixer-0.3.0-7vTOWVmX7tmF7GIGTcxaSH"

RDEPENDS:${PN} += "/usr/bin/sh \
alsa-devel \
ghc-alsa-mixer \
ghc-compiler \
ghc-devel-alsa-core-0.5.0.1-5CJfdeELTf160s2ftizQdy \
ghc-devel-base-4.17.2.0 \
ghc-devel-unix-2.7.3"

inherit rpm
