SUMMARY = "Haskell random profiling library"
DESCRIPTION = "This package provides the Haskell random profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.1"

RPM_NAME = "ghc-random-prof-1.2.1.1-2.2.aarch64.rpm"
RPM_HASH = "3ffdf37270556f16ced17e6e0672c10a7bad4f92de27f075bc4323823edb6131d21d1a8f3c4cebdcf097ae775f169033d5de588851c63a5a8eb13db310f49039"

RPROVIDES:${PN} += "ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-random-prof \
ghc-random-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(mtl-2.2.2) \
ghc-prof(splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe) \
ghc-random-devel"

inherit rpm
