SUMMARY = "Haskell bifunctors library development files"
DESCRIPTION = "This package provides the Haskell bifunctors library development files."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-devel-5.5.15-1.9.aarch64.rpm"
RPM_HASH = "7b69b167dd1f8161a6944804c0a3253bfbfba7d905c663146d31be6dd1cf10bd5bb5d207384f742cf53f9b9de551b1b39a0298c7ff028cc2a13d94e8b2463110"

RPROVIDES:${PN} += "ghc-bifunctors-devel \
ghc-devel-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bifunctors \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-containers-0.6.7 \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-devel-transformers-0.5.6.2"

inherit rpm
