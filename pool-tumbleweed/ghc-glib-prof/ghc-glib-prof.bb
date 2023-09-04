SUMMARY = "Haskell glib profiling library"
DESCRIPTION = "This package provides the Haskell glib profiling library."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-glib-prof-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "e2f31e77d20df37fe99a20b0fcec4dc6745b0555c00a717c97fa045270c48a5ed7aea7a6dfd79f01a844e51d1f6c9cf16ce503f1c13185233f2f6277100142bf"

RPROVIDES:${PN} += "ghc-glib-prof \
ghc-prof-glib-0.13.10.0-FwtjszetdFF6KErN1CKeSg"

RDEPENDS:${PN} += "ghc-glib-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
