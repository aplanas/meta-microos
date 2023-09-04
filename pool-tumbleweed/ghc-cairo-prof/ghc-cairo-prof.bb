SUMMARY = "Haskell cairo profiling library"
DESCRIPTION = "This package provides the Haskell cairo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.10.0"

RPM_NAME = "ghc-cairo-prof-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "7c056df2b9e98b18384823c2ffe136b8c3ba277fd86925f847341b1d93a5a72961b2979e49d26946705bd49be4963a0733e5e05ec2639a71b2f41f2eee29d865"

RPROVIDES:${PN} += "ghc-cairo-prof \
ghc-prof-cairo-0.13.10.0-B3UP0Vi5jIV99bUcWUsXgu"

RDEPENDS:${PN} += "ghc-cairo-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
