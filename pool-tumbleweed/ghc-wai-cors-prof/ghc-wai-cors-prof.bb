SUMMARY = "Haskell wai-cors profiling library"
DESCRIPTION = "This package provides the Haskell wai-cors profiling library."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-prof-0.2.7-1.3.aarch64.rpm"
RPM_HASH = "147f28ede6e85090f4476adb4aab4c2836ef33ffe98ecc3c80bc99ceb61a35abe6eaff93dd5f6f31e4a35cb927c2dce950ad8fc14792f7881ae50b2a95010215"

RPROVIDES:${PN} += "ghc-prof-wai-cors-0.2.7-837xDMoVzk8L5Mw3yyuBT9 \
ghc-wai-cors-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-unicode-symbols-0.2.4.2-2uW4hd16ZmNBkWsH22htOC \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-wai-cors-devel"

inherit rpm
