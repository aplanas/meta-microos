SUMMARY = "Haskell wai-logger profiling library"
DESCRIPTION = "This package provides the Haskell wai-logger profiling library."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-prof-2.4.0-2.9.aarch64.rpm"
RPM_HASH = "1a3db5f0ea98658b92adfbee7b19d6a1a95da8fcee98a1e669107ce5eaca41d02324c0f83076c38179363add4f846d0694ea0e119126c41eb7ec62d4af58dcd1"

RPROVIDES:${PN} += "ghc-prof-wai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs \
ghc-wai-logger-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-byteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-wai-logger-devel"

inherit rpm
