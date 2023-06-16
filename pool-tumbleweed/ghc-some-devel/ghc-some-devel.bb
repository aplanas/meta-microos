SUMMARY = "Haskell some library development files"
DESCRIPTION = "This package provides the Haskell some library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-devel-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "bb0e662b9e51893c48348f3ccf905c2708debbcbb9117f4034e02cbab03893560f938ff884a5d5b3faf6af34af8b7418773789ce9f43a32464e82976affe5f62"

RPROVIDES:${PN} += "ghc-devel-some-1.0.5-3dwCpkSImpx8T8axxRPR3Z \
ghc-some-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-some"

inherit rpm
