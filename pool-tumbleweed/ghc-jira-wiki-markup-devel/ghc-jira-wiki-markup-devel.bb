SUMMARY = "Haskell jira-wiki-markup library development files"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup library development \
files."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-devel-1.5.1-1.8.aarch64.rpm"
RPM_HASH = "7fa6ec1fb5c5f8c42430bc28f69908375e49857463a207ecdd8e4d6610bd50497314a018ea7dd69ee87003c64dca7122fc0c3fcb190fd7a147142a6993ba5e56"

RPROVIDES:${PN} += "ghc-devel-jira-wiki-markup-1.5.1-Kpl2oQNac464TohGq5hnAO \
ghc-jira-wiki-markup-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-jira-wiki-markup"

inherit rpm
