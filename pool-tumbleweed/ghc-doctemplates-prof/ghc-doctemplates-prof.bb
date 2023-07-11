SUMMARY = "Haskell doctemplates profiling library"
DESCRIPTION = "This package provides the Haskell doctemplates profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-prof-0.11-1.3.aarch64.rpm"
RPM_HASH = "832a14fca8fbd91f78656a070b8ef602d05e495dc5bda1900045dc4adb92f291a1b3593a69b4420746893de51ec3c6cc5732a1e6d779b50fdad7372d107369a8"

RPROVIDES:${PN} += "ghc-doctemplates-prof \
ghc-prof-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp"

RDEPENDS:${PN} += "ghc-doctemplates-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-text-2.0.2 \
ghc-prof-text-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
