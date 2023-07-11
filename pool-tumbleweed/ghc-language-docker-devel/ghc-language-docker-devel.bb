SUMMARY = "Haskell language-docker library development files"
DESCRIPTION = "This package provides the Haskell language-docker library development \
files."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-devel-11.0.0-1.7.aarch64.rpm"
RPM_HASH = "3351ebbe94fb8e54d5eab40ea719595f0c43ef578cb65e7eaa0759c9241761fcdc8bc8886ad58f9ad5ee9ca37f8bd662547278e5d2c570c70acb39ce06739d89"

RPROVIDES:${PN} += "ghc-devel-language-docker-11.0.0-6yi9Nm1hnNl1NYn66IUrp7 \
ghc-language-docker-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-devel-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-language-docker"

inherit rpm
