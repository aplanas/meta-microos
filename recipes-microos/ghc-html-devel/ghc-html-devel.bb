SUMMARY = "Haskell html library development files"
DESCRIPTION = "This package provides the Haskell html library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-devel-1.0.1.2-4.2.aarch64.rpm"
RPM_HASH = "37881bc6807f76e7afef659d7c431fd6c653c9b9548989952d1dbeea3128e8215c0ba99d8eeb5c89825279b4dd7006cc401022d4b2913c5b9f04897c24f257f7"

RPROVIDES:${PN} += "ghc-devel(html-1.0.1.2-U7qWIp0bJwCnAFPlj3UZy) \
ghc-html-devel \
ghc-html-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-html"

inherit rpm
