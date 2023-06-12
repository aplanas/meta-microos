SUMMARY = "Haskell timezone-series library development files"
DESCRIPTION = "This package provides the Haskell timezone-series library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-devel-0.1.13-2.2.aarch64.rpm"
RPM_HASH = "2792299af15330dc5b680f1fe47d56052fbad1770dc8188adeb1f5ebd33d4be581579841cf40ad6b2b61752041e297c7ef5f126208ed71d55f3f90e81a25d9ce"

RPROVIDES:${PN} += "ghc-devel(timezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK) \
ghc-timezone-series-devel \
ghc-timezone-series-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(time-1.12.2) \
ghc-timezone-series"

inherit rpm
