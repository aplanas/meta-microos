SUMMARY = "Haskell securemem profiling library"
DESCRIPTION = "This package provides the Haskell securemem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-prof-0.1.10-4.2.aarch64.rpm"
RPM_HASH = "55b6a17cf37a8f843facbfebf2cc2cd48ce1efef02a9f24bc4b5cd216d7b9d7c2af2b0e6633db847437c730ba0818b65566795f9177ea099d5d06681ac4ef560"

RPROVIDES:${PN} += "ghc-prof(securemem-0.1.10-BbcWu3otOS6JQaPW3JfszZ) ghc-securemem-prof ghc-securemem-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg) ghc-prof(bytestring-0.11.4.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) ghc-securemem-devel"

inherit rpm
