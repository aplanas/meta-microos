SUMMARY = "Haskell semigroups library development files"
DESCRIPTION = "This package provides the Haskell semigroups library development files."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "ghc-semigroups-devel-0.20-2.3.aarch64.rpm"
RPM_HASH = "71c020c711fb7287d8799be64aa6f87e9aab845e2e3d94c9b11af882958b35872b6a35a867ebfd31d4e9bc99c5f43549f454d98e0dcee8027d3f3b9f43ed4083"

RPROVIDES:${PN} += "ghc-devel-semigroups-0.20-6lktLD0mxwZ1Pjuc7q3dSl \
ghc-semigroups-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-semigroups"

inherit rpm
