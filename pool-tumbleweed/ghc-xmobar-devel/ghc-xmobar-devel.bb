SUMMARY = "Haskell xmobar library development files"
DESCRIPTION = "This package provides the Haskell xmobar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-devel-0.46-2.6.aarch64.rpm"
RPM_HASH = "671774ace8e0d366a47092f6bca0131d92856b0d86ee5b200bd62e46bc0e85d7d9664e76a9111a3287f4ee259b23beab1869d56d7cae3d5916471137530fff6b"

RPROVIDES:${PN} += "ghc-devel-xmobar-0.46-DhrI5ajBaxsFpM5X4lvgLT \
ghc-xmobar-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX \
ghc-devel-X11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg \
ghc-devel-alsa-mixer-0.3.0-Ff4FVP5Sg8l3sx20Z8BrVj \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cairo-0.13.10.0-79KHEyza8Yx2ITjvRp5k2b \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-devel-containers-0.6.7 \
ghc-devel-dbus-1.2.29-JhRn6zoUbJw4eAvR7pzqTU \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hinotify-0.4.1-8EvWCUqnZLR2V2Cj5bSrk3 \
ghc-devel-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-devel-http-conduit-2.3.8.2-8tllEf20Pfc53Ypql5ryYG \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-libmpd-0.10.0.0-1mRX9TQl9aY4gH6teXbpki \
ghc-devel-mtl-2.2.2 \
ghc-devel-netlink-1.1.1.0-3cQkQWnXFQnLtl9CehLMU3 \
ghc-devel-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-devel-pango-0.13.10.0-Es56i1Q8thp2nfdEwUTWXD \
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
