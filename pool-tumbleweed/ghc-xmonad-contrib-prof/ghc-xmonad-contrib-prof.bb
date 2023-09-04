SUMMARY = "Haskell xmonad-contrib profiling library"
DESCRIPTION = "This package provides the Haskell xmonad-contrib profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.17.1"

RPM_NAME = "ghc-xmonad-contrib-prof-0.17.1-3.9.aarch64.rpm"
RPM_HASH = "96186c45c75fb6cffaca1f618b4526ca9821a9d84d27686acf111553079674cff507890202f16fc2b285eb0ac9d230e214f41671d4b9f6742aa7faa6c5acbd03"

RPROVIDES:${PN} += "ghc-prof-xmonad-contrib-0.17.1-5rViN1CbGyt6rkBLjPE8fT \
ghc-xmonad-contrib-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4 \
ghc-prof-X11-xft-0.3.4-7SpxQIcr2IsKaDkpOrx1dS \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-prof-xmonad-0.17.2-5u18H8h5WrJ4e8esV9nzjE \
ghc-xmonad-contrib-devel"

inherit rpm
