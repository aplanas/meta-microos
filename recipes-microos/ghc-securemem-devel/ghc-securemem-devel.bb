SUMMARY = "Haskell securemem library development files"
DESCRIPTION = "This package provides the Haskell securemem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-devel-0.1.10-4.2.aarch64.rpm"
RPM_HASH = "0a8b1a2871f8f0b24e1e452076c0ef2158f910525ba4a45aab01d97aeafceedd3a44d6e0223a7f154b42382d4b53260ee80a02ef62470414bfc5215d11f92d30"

RPROVIDES:${PN} += "ghc-devel(securemem-0.1.10-BbcWu3otOS6JQaPW3JfszZ) ghc-securemem-devel ghc-securemem-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg) ghc-devel(bytestring-0.11.4.0) ghc-devel(ghc-prim-0.9.0) ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) ghc-securemem"

inherit rpm
