SUMMARY = "Haskell libyaml library documentation"
DESCRIPTION = "This package provides the Haskell libyaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-doc-0.1.2-6.7.noarch.rpm"
RPM_HASH = "e704308b13b694b5d6c4253725cabe6e4863d5cf4a6d06a644f8c0f82449b70ce4391db96de952147750f6a1716271c1ff378bddc5911b97d3ee04b728a19d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libyaml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
