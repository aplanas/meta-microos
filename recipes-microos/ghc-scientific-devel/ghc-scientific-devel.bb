SUMMARY = "Haskell scientific library development files"
DESCRIPTION = "This package provides the Haskell scientific library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-devel-0.3.7.0-5.3.aarch64.rpm"
RPM_HASH = "6d76cea2ad8c7fdcc30997bf0c435faf1ffec5a44bed4ac697f131dbd4bbf353c26695822758591ba95dda53d703e56e74b1565ac20d68e0531e21474c4ebfaa"

RPROVIDES:${PN} += "ghc-devel(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-scientific-devel \
ghc-scientific-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(integer-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu) \
ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-scientific"

inherit rpm
