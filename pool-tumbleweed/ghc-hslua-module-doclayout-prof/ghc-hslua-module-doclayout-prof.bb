SUMMARY = "Haskell hslua-module-doclayout profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-prof-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "870de559399960fe5dac1c004557119dfb81dcd8013a596d5650b5163dc6fc20fbe431a081b56d4327a54712119a173daf16a5abcf5c7f724d680b17897c1bbc"

RPROVIDES:${PN} += "ghc-hslua-module-doclayout-prof \
ghc-prof-hslua-module-doclayout-1.1.0-whScExHkOx9DJU69TzJBc"

RDEPENDS:${PN} += "ghc-hslua-module-doclayout-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-prof-hslua-2.3.0-AU21dADSMqd8jVkw5fw6gb \
ghc-prof-text-2.0.2"

inherit rpm
