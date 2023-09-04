SUMMARY = "Obtain minified chart.js code"
DESCRIPTION = "This package bundles the minified <http://www.chartjs.org/ chart.js> code into \
a Haskell package, so it can be depended upon by Cabal packages. The first \
three components of the version number match the upstream chart.js version. \
The package is designed to meet the redistribution requirements of downstream \
users (e.g. Debian). This package is a fork of \
<https://hackage.haskell.org/package/js-flot js-flot> using chart.js instead of \
flot."
LICENSE = "MIT"

PV = "2.9.4.1"

RPM_NAME = "ghc-js-chart-2.9.4.1-2.3.aarch64.rpm"
RPM_HASH = "9c0981bb4c240339a42ace7e83be9516869f3b5e04bb734e9c21793e9b08783934b00489961d86643f504c00de444d111e9f6509119c8320c6f47658abf40c31"

RPROVIDES:${PN} += "ghc-js-chart \
libHSjs-chart-2.9.4.1-JVxU4FDcB7p8n92cFFYHGl-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
