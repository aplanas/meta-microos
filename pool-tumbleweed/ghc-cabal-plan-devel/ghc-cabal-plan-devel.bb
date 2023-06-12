SUMMARY = "Haskell cabal-plan library development files"
DESCRIPTION = "This package provides the Haskell cabal-plan library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2.3"

RPM_NAME = "ghc-cabal-plan-devel-0.7.2.3-1.3.aarch64.rpm"
RPM_HASH = "f4067ba0e246a438da43d8818b8ba78948dc8324f5cc08e73afb85134db2978145d858e8fe0d299cdeaf5453097943378f97ed5df2bc87bcfb4c77388f4df726"

RPROVIDES:${PN} += "ghc-cabal-plan-devel \
ghc-cabal-plan-devel(aarch-64) \
ghc-devel(cabal-plan-0.7.2.3-5ryJl4z9bHqN70ORM7EbT)"
RDEPENDS:${PN} += "/bin/sh \
ghc-cabal-plan \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0) \
ghc-devel(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(text-2.0.2)"

inherit rpm
