SUMMARY = "Haskell microstache library development files"
DESCRIPTION = "This package provides the Haskell microstache library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-devel-1.0.2.3-2.3.aarch64.rpm"
RPM_HASH = "81f1001fca0e783a4c8dbebc7cb7dba15b2e9737666378a1ff00c6756fac376434f9fea9e5ff2c6a8601b2c1350264408b22873ca9918d4bec8e4a46c52e7c22"

RPROVIDES:${PN} += "ghc-devel(microstache-1.0.2.3-AHAKnK06lT6DHccapktUKL) \
ghc-microstache-devel \
ghc-microstache-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-microstache"

inherit rpm
