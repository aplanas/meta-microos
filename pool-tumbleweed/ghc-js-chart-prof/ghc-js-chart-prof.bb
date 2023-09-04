SUMMARY = "Haskell js-chart profiling library"
DESCRIPTION = "This package provides the Haskell js-chart profiling library."
LICENSE = "MIT"

PV = "2.9.4.1"

RPM_NAME = "ghc-js-chart-prof-2.9.4.1-2.3.aarch64.rpm"
RPM_HASH = "78852ab57e25a5c0066c035baf3435424a69caedc1f6d391db2be93a0188f2563b4d792c8d0563b9fa93a49d0e796102ad17eed7239d8375506f31edc81ceab4"

RPROVIDES:${PN} += "ghc-js-chart-prof \
ghc-prof-js-chart-2.9.4.1-JVxU4FDcB7p8n92cFFYHGl"

RDEPENDS:${PN} += "ghc-js-chart-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
