SUMMARY = "Haskell microlens library development files"
DESCRIPTION = "This package provides the Haskell microlens library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.13.1"

RPM_NAME = "ghc-microlens-devel-0.4.13.1-2.3.aarch64.rpm"
RPM_HASH = "0ab916345af0de3f2615908f09da2b154b4957e20375e329c446965f9c517de2a239d62e149f722c1cafcf0ae4232ed0140b666d223e2bb890ff49956f58184f"

RPROVIDES:${PN} += "ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-microlens-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-microlens"

inherit rpm
