SUMMARY = "Haskell tls-session-manager library development files"
DESCRIPTION = "This package provides the Haskell tls-session-manager library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-devel-0.0.4-4.3.aarch64.rpm"
RPM_HASH = "c955ed5dc77903334b49c01793f992fa37e605d94db56953422e6d542269a388cf8f517304dc61e895adb736bc5db96bcb96cc3047b64408ee7363c25327daa1"

RPROVIDES:${PN} += "ghc-devel-tls-session-manager-0.0.4-H4ntEZmH6lq6RcNU9soHmP \
ghc-tls-session-manager-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-devel-base-4.17.1.0 \
ghc-devel-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-devel-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-tls-session-manager"

inherit rpm
