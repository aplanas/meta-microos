SUMMARY = "Haskell blaze-html library development files"
DESCRIPTION = "This package provides the Haskell blaze-html library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-devel-0.9.1.2-9.3.aarch64.rpm"
RPM_HASH = "a11302a81a7ede3f8b3ef92d55efed6b5d398cbc636cd791bbb0d18e2eb8e0ec922965604328394b410d3911870f51f92152d3ce975e8115ec14ec4eb67514a2"

RPROVIDES:${PN} += "ghc-blaze-html-devel \
ghc-devel-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-html \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2"

inherit rpm
