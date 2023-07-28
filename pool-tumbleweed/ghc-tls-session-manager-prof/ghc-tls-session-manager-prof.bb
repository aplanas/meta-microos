SUMMARY = "Haskell tls-session-manager profiling library"
DESCRIPTION = "This package provides the Haskell tls-session-manager profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-prof-0.0.4-4.4.aarch64.rpm"
RPM_HASH = "0c7a995e0efdd3fe2eab313a32a7c1560eab8ec04e7b4bf7791a4fc8c3c1f463b80d571e9940881330d79b3fae14812f64c588a64b8af12e03eef30aa1c6372d"

RPROVIDES:${PN} += "ghc-prof-tls-session-manager-0.0.4-E4DLe19pSesGogH0zlyp57 \
ghc-tls-session-manager-prof"

RDEPENDS:${PN} += "ghc-prof-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-prof-base-4.17.1.0 \
ghc-prof-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-clock-0.8.4-Kk7SFw4SNhZ8ktwfjRIPil \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-prof-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-tls-session-manager-devel"

inherit rpm
