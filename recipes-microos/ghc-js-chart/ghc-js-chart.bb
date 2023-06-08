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

RPM_NAME = "ghc-js-chart-2.9.4.1-2.2.aarch64.rpm"
RPM_HASH = "4111bf7c4382fca6f604eb5ea61d858762bca0881200ee932b81ee175418b866efbd74af030e2b2948a816e3c494967901227b3b22778484795f0b24a29704b7"

RPROVIDES:${PN} += "ghc-js-chart ghc-js-chart(aarch-64) libHSjs-chart-2.9.4.1-3Q5pmv83RztDkZZL9zv96d-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
