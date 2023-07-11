SUMMARY = "Haskell xmobar profiling library"
DESCRIPTION = "This package provides the Haskell xmobar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-prof-0.46-2.6.aarch64.rpm"
RPM_HASH = "9b111b24e6dbdc4983c11bdb4cd0658a1c47c05ecbeac831710b5678f3fa58d8f6bf4d11387ca90cd30b4e7563b627ddfa2fb20299ae4e234ecf234db7b8e671"

RPROVIDES:${PN} += "ghc-prof-xmobar-0.46-DhrI5ajBaxsFpM5X4lvgLT \
ghc-xmobar-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX \
ghc-prof-X11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg \
ghc-prof-alsa-mixer-0.3.0-Ff4FVP5Sg8l3sx20Z8BrVj \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cairo-0.13.10.0-79KHEyza8Yx2ITjvRp5k2b \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-prof-containers-0.6.7 \
ghc-prof-dbus-1.2.29-JhRn6zoUbJw4eAvR7pzqTU \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hinotify-0.4.1-8EvWCUqnZLR2V2Cj5bSrk3 \
ghc-prof-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-prof-http-conduit-2.3.8.2-8tllEf20Pfc53Ypql5ryYG \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-libmpd-0.10.0.0-1mRX9TQl9aY4gH6teXbpki \
ghc-prof-mtl-2.2.2 \
ghc-prof-netlink-1.1.1.0-3cQkQWnXFQnLtl9CehLMU3 \
ghc-prof-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-prof-pango-0.13.10.0-Es56i1Q8thp2nfdEwUTWXD \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-parsec-numbers-0.1.0-EpxP3vMK5SifJrb3FqKTJ \
ghc-prof-process-1.6.16.0 \
ghc-prof-regex-compat-0.95.2.1-9I4JwtnoxVY9Cu5lIL0XLJ \
ghc-prof-stm-2.5.1.0 \
ghc-prof-time-1.12.2 \
ghc-prof-timezone-olson-0.2.1-GQQU9hvoQrwIpL0LHxa8ME \
ghc-prof-timezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-xmobar-devel"

inherit rpm
