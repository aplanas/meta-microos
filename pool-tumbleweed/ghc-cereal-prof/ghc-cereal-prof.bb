SUMMARY = "Haskell cereal profiling library"
DESCRIPTION = "This package provides the Haskell cereal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-prof-0.5.8.3-2.8.aarch64.rpm"
RPM_HASH = "8c18478d6f8cb606f029ef5eedc6cbd0b03c170b65e0ef5a696a29529ecfe6e97293af0812ef716ba97db3b5755381481ae410d670a44b3182ab523678b9dbdf"

RPROVIDES:${PN} += "ghc-cereal-prof \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I"

RDEPENDS:${PN} += "ghc-cereal-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
