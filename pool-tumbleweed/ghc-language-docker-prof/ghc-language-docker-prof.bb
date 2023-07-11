SUMMARY = "Haskell language-docker profiling library"
DESCRIPTION = "This package provides the Haskell language-docker profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-prof-11.0.0-1.7.aarch64.rpm"
RPM_HASH = "1606af13741f78254d69dc26c93bc02491c125e3b31d1ea304c8d73281e88cccec313015227a517ff87dfca0307fa7622735d37dfb23941feff57f57fee55803"

RPROVIDES:${PN} += "ghc-language-docker-prof \
ghc-prof-language-docker-11.0.0-6yi9Nm1hnNl1NYn66IUrp7"

RDEPENDS:${PN} += "ghc-language-docker-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-prof-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2"

inherit rpm
