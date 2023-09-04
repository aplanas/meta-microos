SUMMARY = "Haskell tasty-hunit profiling library"
DESCRIPTION = "This package provides the Haskell tasty-hunit profiling library."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-prof-0.10.0.3-2.5.aarch64.rpm"
RPM_HASH = "c93ea8a6dbedbeb0414f01ce4c0db424524896a1e52cb508fbd1a1fadb18585a0db84127bbb71be06abe35a27c982a5b93b9c499ae67789aae6f9f9781370a80"

RPROVIDES:${PN} += "ghc-prof-tasty-hunit-0.10.0.3-2hefb6clI09Drjkc6dw6d8 \
ghc-tasty-hunit-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-prof-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-tasty-hunit-devel"

inherit rpm
