SUMMARY = "Haskell unicode-collation library documentation"
DESCRIPTION = "This package provides the Haskell unicode-collation library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-doc-0.1.3.4-1.9.noarch.rpm"
RPM_HASH = "f07428b798bf991e5ca4f076c2ff22da0a977094bef35cc4092ce2df28f497ac63428b3be83ef0d39b6ee120e67bb813189eff3268ac4c6442868639f3ffdb94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-collation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
