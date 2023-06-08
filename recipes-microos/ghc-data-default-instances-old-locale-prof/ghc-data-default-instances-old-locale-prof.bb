SUMMARY = "Haskell data-default-instances-old-locale profiling library"
DESCRIPTION = "This package provides the Haskell data-default-instances-old-locale profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-old-locale-prof-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "11e24bf2c9e79de5a5831c3042f0c509a7bcb7a9f9ec908b2baf68b779c79c66d49ff36017565298e0eeb2c3fb3f57104342ec37ae6148c1c5e4e0401cd83c89"

RPROVIDES:${PN} += "ghc-data-default-instances-old-locale-prof ghc-data-default-instances-old-locale-prof(aarch-64) ghc-prof(data-default-instances-old-locale-0.0.1-7AZu0A9Np87C6EgyuU2uGo)"
RDEPENDS:${PN} += "ghc-data-default-instances-old-locale-devel ghc-prof(base-4.17.1.0) ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) ghc-prof(old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR)"

inherit rpm
