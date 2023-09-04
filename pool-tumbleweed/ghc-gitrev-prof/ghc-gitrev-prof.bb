SUMMARY = "Haskell gitrev profiling library"
DESCRIPTION = "This package provides the Haskell gitrev profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-prof-1.3.1-9.4.aarch64.rpm"
RPM_HASH = "296e5329213caaa4888f9921b1c5d20f96beaa4043b6570356ffeb506d2d7697f4921bcf65f9af1d4dd4d92af03311de0d6cc7b05fe825e468a6c59d4b84a436"

RPROVIDES:${PN} += "ghc-gitrev-prof \
ghc-prof-gitrev-1.3.1-9Q0DldHbAfz2pygdzHH3jX"

RDEPENDS:${PN} += "ghc-gitrev-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
