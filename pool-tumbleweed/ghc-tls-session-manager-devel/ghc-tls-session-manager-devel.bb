SUMMARY = "Haskell tls-session-manager library development files"
DESCRIPTION = "This package provides the Haskell tls-session-manager library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-devel-0.0.4-4.4.aarch64.rpm"
RPM_HASH = "9f8ac77315fd469e810329d56e40c993b2d47cad92b0a54d54bfa822a7cbed9d19ae0c4d1c72c5379bd576df8b59d3ca31255c6976076474e863e04c89114fde"

RPROVIDES:${PN} += "ghc-devel-tls-session-manager-0.0.4-E4DLe19pSesGogH0zlyp57 \
ghc-tls-session-manager-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-devel-base-4.17.1.0 \
ghc-devel-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-clock-0.8.4-Kk7SFw4SNhZ8ktwfjRIPil \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-devel-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-tls-session-manager"

inherit rpm
