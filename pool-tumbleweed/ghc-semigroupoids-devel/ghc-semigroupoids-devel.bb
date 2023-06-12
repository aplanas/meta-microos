SUMMARY = "Haskell semigroupoids library development files"
DESCRIPTION = "This package provides the Haskell semigroupoids library development files."
LICENSE = "BSD-2-Clause"

PV = "5.3.7"

RPM_NAME = "ghc-semigroupoids-devel-5.3.7-2.3.aarch64.rpm"
RPM_HASH = "9bbd7a8a245774ce744f2caafd71e3a440d9d819727e38a06bf1bb1248d29c02b0c50a650c2ee91d59c3ab45b67a265b4792716757fa7368787c58e66fb6c207"

RPROVIDES:${PN} += "ghc-devel(semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1) \
ghc-semigroupoids-devel \
ghc-semigroupoids-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) \
ghc-devel(bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL) \
ghc-devel(comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4) \
ghc-devel(containers-0.6.7) \
ghc-devel(contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao) \
ghc-devel(distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-semigroupoids"

inherit rpm
