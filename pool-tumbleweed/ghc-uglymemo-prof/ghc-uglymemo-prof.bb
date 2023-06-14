SUMMARY = "Haskell uglymemo profiling library"
DESCRIPTION = "This package provides the Haskell uglymemo profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-prof-0.1.0.1-4.2.aarch64.rpm"
RPM_HASH = "1b69bc80cae82d06712ca21c0b9eaabf460b4841cf956ea7c4fbda6b9cb70c591947cdf381e3abfc8c7712281be6eb3390ff6994b21df5cdb8d63899ae54e92d"

RPROVIDES:${PN} += "ghc-prof-uglymemo-0.1.0.1-Balkr8KlO4bDeailuusufT \
ghc-uglymemo-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-uglymemo-devel"

inherit rpm
