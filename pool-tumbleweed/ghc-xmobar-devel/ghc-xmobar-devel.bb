SUMMARY = "Haskell xmobar library development files"
DESCRIPTION = "This package provides the Haskell xmobar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-devel-0.46-2.4.aarch64.rpm"
RPM_HASH = "dfe33296df4d5dc1ce1c85346d5b7439fc897a4d82f87cbd0df3f042ba1a4d2e9b3fde449ef2eb39e44324454066c0fe980a79fda2d099b4ad70b642d176fe73"

RPROVIDES:${PN} += "ghc-devel-xmobar-0.46-EX7mQtJrJ088kSUMN9v7Od \
ghc-xmobar-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX \
ghc-devel-X11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg \
ghc-devel-alsa-mixer-0.3.0-Ff4FVP5Sg8l3sx20Z8BrVj \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cairo-0.13.8.2-84nOBKgVLz3788JDxxB5om \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-devel-containers-0.6.7 \
ghc-devel-dbus-1.2.28-27GbkRPSCRwKgi0yxoNYFh \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hinotify-0.4.1-8EvWCUqnZLR2V2Cj5bSrk3 \
ghc-devel-http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0 \
ghc-devel-http-conduit-2.3.8-9gcbWW2UjPVHQDceZSAOIR \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-libmpd-0.10.0.0-LD6WRi8pb0r8mm5YrtyxA5 \
ghc-devel-mtl-2.2.2 \
ghc-devel-netlink-1.1.1.0-3cQkQWnXFQnLtl9CehLMU3 \
ghc-devel-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-devel-pango-0.13.8.2-AyE0ruIpbddIIASgXg66h2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-parsec-numbers-0.1.0-EpxP3vMK5SifJrb3FqKTJ \
ghc-devel-process-1.6.16.0 \
ghc-devel-regex-compat-0.95.2.1-9I4JwtnoxVY9Cu5lIL0XLJ \
ghc-devel-stm-2.5.1.0 \
ghc-devel-time-1.12.2 \
ghc-devel-timezone-olson-0.2.1-GQQU9hvoQrwIpL0LHxa8ME \
ghc-devel-timezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-xmobar \
libXpm-devel \
libXrandr-devel \
libXrender-devel"

inherit rpm
