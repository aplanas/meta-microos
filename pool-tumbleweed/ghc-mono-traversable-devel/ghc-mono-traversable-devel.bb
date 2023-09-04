SUMMARY = "Haskell mono-traversable library development files"
DESCRIPTION = "This package provides the Haskell mono-traversable library development \
files."
LICENSE = "MIT"

PV = "1.0.15.3"

RPM_NAME = "ghc-mono-traversable-devel-1.0.15.3-2.10.aarch64.rpm"
RPM_HASH = "1470d726e6553fbded5b4c6a655abb279ad99773ec9f1937ccd8f2ea7c11e7e001c16d804bbcde1f27ad40a90f2c0b8fb176cb503fbe4275cec11b4389b703c7"

RPROVIDES:${PN} += "ghc-devel-mono-traversable-1.0.15.3-LJDObfSqMuwFAwfZMa8qoW \
ghc-mono-traversable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr \
ghc-mono-traversable"

inherit rpm
