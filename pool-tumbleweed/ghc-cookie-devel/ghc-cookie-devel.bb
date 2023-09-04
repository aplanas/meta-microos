SUMMARY = "Haskell cookie library development files"
DESCRIPTION = "This package provides the Haskell cookie library development files."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "ghc-cookie-devel-0.4.6-2.3.aarch64.rpm"
RPM_HASH = "61c4befe9696c2439f2a736336c6e612e5c16088b6886dcba1150115f4654fd9df20d6e92655601c5827ef1876ff7fccc9ce7af8e55984489b4f7c3df5183948"

RPROVIDES:${PN} += "ghc-cookie-devel \
ghc-devel-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cookie \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2"

inherit rpm
