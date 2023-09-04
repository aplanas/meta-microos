SUMMARY = "Haskell xmonad-contrib library development files"
DESCRIPTION = "This package provides the Haskell xmonad-contrib library development files."
LICENSE = "BSD-3-Clause"

PV = "0.17.1"

RPM_NAME = "ghc-xmonad-contrib-devel-0.17.1-3.9.aarch64.rpm"
RPM_HASH = "8fcaf32cd4d2268f092269a147c75e888c1eea7428d2759c35bdb408795060105eb417578bd323c16407412045151a66093bdaa66b959865c650fef67c87f3da"

RPROVIDES:${PN} += "ghc-devel-xmonad-contrib-0.17.1-5rViN1CbGyt6rkBLjPE8fT \
ghc-xmonad-contrib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4 \
ghc-devel-X11-xft-0.3.4-7SpxQIcr2IsKaDkpOrx1dS \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-xmonad-0.17.2-5u18H8h5WrJ4e8esV9nzjE \
ghc-xmonad-contrib"

inherit rpm
