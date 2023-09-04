SUMMARY = "Haskell microlens library documentation"
DESCRIPTION = "This package provides the Haskell microlens library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.13.1"

RPM_NAME = "ghc-microlens-doc-0.4.13.1-2.3.noarch.rpm"
RPM_HASH = "70e3af17064c71b1d78c3eb546b0d8d622e4814ab498d66a0c864717033a11dd16690fd1a172f7f2c02a574548be6709c2669ad1328ab5b45b01e85d700651dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
