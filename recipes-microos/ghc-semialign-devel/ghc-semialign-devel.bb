SUMMARY = "Haskell semialign library development files"
DESCRIPTION = "This package provides the Haskell semialign library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.0.1"

RPM_NAME = "ghc-semialign-devel-1.2.0.1-5.3.aarch64.rpm"
RPM_HASH = "aab87ef8c2dc9fb7a37ce86d6e85aa4d90b77040f4c0a1b405c9fa863828af2336c422b7823f81346ada997572428bf7396f814b21b8124c95bd8a30d35d34c8"

RPROVIDES:${PN} += "ghc-devel(semialign-1.2.0.1-LDzKW6eKwIG6WFTA9nak5m) ghc-semialign-devel ghc-semialign-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-devel(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs) ghc-devel(indexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO) ghc-devel(semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1) ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) ghc-devel(these-1.1.1.1-3POHYes25uBIW53bcrDd39) ghc-devel(transformers-0.5.6.2) ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-semialign"

inherit rpm
