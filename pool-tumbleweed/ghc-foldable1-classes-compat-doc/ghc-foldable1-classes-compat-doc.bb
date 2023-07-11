SUMMARY = "Haskell foldable1-classes-compat library documentation"
DESCRIPTION = "This package provides the Haskell foldable1-classes-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-foldable1-classes-compat-doc-0.1-1.3.noarch.rpm"
RPM_HASH = "4693efcb75669d8cb80740a3f5e07869ed33361b1e60750af7131672627b0bb45a803d2a8a49b43b4130345a08362abd07555309794a9ff927773124b7892e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-foldable1-classes-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
