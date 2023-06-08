SUMMARY = "Haskell ipynb profiling library"
DESCRIPTION = "This package provides the Haskell ipynb profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-prof-0.2-2.2.aarch64.rpm"
RPM_HASH = "1206bb8ac69d58cd9fc6cf88a6f9963a304c24c490293d306b69e6ae6c33c32a462c57245de5c1bd0961f59facd326c4fe32504b68241f79df89dc077043ecf6"

RPROVIDES:${PN} += "ghc-ipynb-prof ghc-ipynb-prof(aarch-64) ghc-prof(ipynb-0.2-5jt56R8prxRLKDISePbcpi)"
RDEPENDS:${PN} += "ghc-ipynb-devel ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-prof(base-4.17.1.0) ghc-prof(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(text-2.0.2) ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E)"

inherit rpm
