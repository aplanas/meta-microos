SUMMARY = "Haskell data-clist library development files"
DESCRIPTION = "This package provides the Haskell data-clist library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-devel-0.2-2.2.aarch64.rpm"
RPM_HASH = "03f8f9d5dc49b688dc3265b77b2da126015b006443c10a676ae04f892962cdbfd91c6905e3c26e69e835c1c59215d1fb5008873ea3a656adabd18f863456ca80"

RPROVIDES:${PN} += "ghc-data-clist-devel ghc-data-clist-devel(aarch-64) ghc-devel(data-clist-0.2-LT5UCpKeur34zcxFsnpoqW)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-data-clist ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0)"

inherit rpm
