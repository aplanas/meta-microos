SUMMARY = "Haskell tls-session-manager profiling library"
DESCRIPTION = "This package provides the Haskell tls-session-manager profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-prof-0.0.4-4.3.aarch64.rpm"
RPM_HASH = "1323369f20737071f8bad3923c7d897ce2a2a8e1c02bc7a9aaa78c92e796b5c17ce43210730310f76d69ec60f088e32fba44b182436e7beea1deaf127e80dd13"

RPROVIDES:${PN} += "ghc-prof-tls-session-manager-0.0.4-H4ntEZmH6lq6RcNU9soHmP \
ghc-tls-session-manager-prof"

RDEPENDS:${PN} += "ghc-prof-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-prof-base-4.17.1.0 \
ghc-prof-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-prof-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-tls-session-manager-devel"

inherit rpm
