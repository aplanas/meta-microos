SUMMARY = "Haskell mime-types profiling library"
DESCRIPTION = "This package provides the Haskell mime-types profiling library."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-mime-types-prof-0.1.1.0-2.2.aarch64.rpm"
RPM_HASH = "96a88f833c8f1e1d7cac3773f69927301d89c314d8d1d911f254703081592fb72184bf870c29f1d31c0365653e341251da9cdfcb4daed036508fcc0a86a6320f"

RPROVIDES:${PN} += "ghc-mime-types-prof \
ghc-mime-types-prof(aarch-64) \
ghc-prof(mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm)"

RDEPENDS:${PN} += "ghc-mime-types-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(text-2.0.2)"

inherit rpm
