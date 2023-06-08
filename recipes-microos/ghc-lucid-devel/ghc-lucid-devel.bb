SUMMARY = "Haskell lucid library development files"
DESCRIPTION = "This package provides the Haskell lucid library development files."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-devel-2.11.20230408-1.2.aarch64.rpm"
RPM_HASH = "6701deb81ce61e8640c6f0728b358728eee97c6dff2e2e51cf4e882157c26a2f2f89a4e6e2d6ef285f5cf410e31d180c95346c1c8807eff10bd0dc6ea8b17408"

RPROVIDES:${PN} += "ghc-devel(lucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w) ghc-lucid-devel ghc-lucid-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-devel(mmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC) ghc-devel(mtl-2.2.2) ghc-devel(text-2.0.2) ghc-devel(transformers-0.5.6.2) ghc-lucid"

inherit rpm
