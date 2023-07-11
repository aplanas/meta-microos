SUMMARY = "Haskell fdo-notify profiling library"
DESCRIPTION = "This package provides the Haskell fdo-notify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-prof-0.3.1-4.4.aarch64.rpm"
RPM_HASH = "885a239e639f09eb2d3ea7741cd359da8de02d8fb3a6245d685de88595ac7706757b2a8e69b19116b1ad9c0ac5c1968328cef23d55fa1d4c733f814696071d06"

RPROVIDES:${PN} += "ghc-fdo-notify-prof \
ghc-prof-fdo-notify-0.3.1-1qiCdZWvxesDRRkG7YS65R"

RDEPENDS:${PN} += "ghc-fdo-notify-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-dbus-1.2.29-JhRn6zoUbJw4eAvR7pzqTU"

inherit rpm
