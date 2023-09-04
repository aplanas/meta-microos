SUMMARY = "Haskell wai library development files"
DESCRIPTION = "This package provides the Haskell wai library development files."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-devel-3.2.3-2.5.aarch64.rpm"
RPM_HASH = "ad557a50c834338abd41c94f35d94edcd04dbb27918e8051b9d7b7f00399255550ab9a50bdaf2e22cb44d36a1cd333dc4c7d576d12376835ad19bc3ad87b7f37"

RPROVIDES:${PN} += "ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-wai-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-text-2.0.2 \
ghc-devel-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-wai"

inherit rpm
