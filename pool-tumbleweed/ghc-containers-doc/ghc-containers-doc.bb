SUMMARY = "Haskell containers library documentation"
DESCRIPTION = "This package provides the Haskell containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-doc-0.6.7-3.2.noarch.rpm"
RPM_HASH = "f1b6b759659915b9bea9dd2406e41ddafb5c5e0b7e9934b87c0305e31d4cb55ec2f3702ced8060dff5fd3b29e11937182990bcaece52f7eef744244641b1164b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
