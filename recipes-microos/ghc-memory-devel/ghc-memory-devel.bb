SUMMARY = "Haskell memory library development files"
DESCRIPTION = "This package provides the Haskell memory library development files."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-devel-0.18.0-2.3.aarch64.rpm"
RPM_HASH = "b6dfeee2a5c3653762fbb4c5f570df3a513357b20193b5a1b57c043a60b3d48f72b01f4b9deab55cd88792f593b6a8f8528a82beb090dc38a7a81517e6e05993"

RPROVIDES:${PN} += "ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-memory-devel \
ghc-memory-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-memory"

inherit rpm
