SUMMARY = "Haskell wai-logger library development files"
DESCRIPTION = "This package provides the Haskell wai-logger library development files."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-devel-2.4.0-2.9.aarch64.rpm"
RPM_HASH = "ee605417c09dfecfe529bfff8ac3303cd631f814ba94575198e6e532f9c57e6d8c1c928a072285c9d80008cf22cd5af65910cb410fdfb832cbaa997e5808e2b1"

RPROVIDES:${PN} += "ghc-devel-wai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs \
ghc-wai-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-byteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-wai-logger"

inherit rpm
