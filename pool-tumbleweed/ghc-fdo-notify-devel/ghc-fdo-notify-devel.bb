SUMMARY = "Haskell fdo-notify library development files"
DESCRIPTION = "This package provides the Haskell fdo-notify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-devel-0.3.1-4.4.aarch64.rpm"
RPM_HASH = "12e1013257f491e483ecc5b42599c7aca9c829e04e27a77990b3e6fc90b04067034b2efa715f41cc88a9b22b7693140512a46540c1a13bc15303729c2e8c9a2f"

RPROVIDES:${PN} += "ghc-devel-fdo-notify-0.3.1-1qiCdZWvxesDRRkG7YS65R \
ghc-fdo-notify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-dbus-1.2.29-JhRn6zoUbJw4eAvR7pzqTU \
ghc-fdo-notify"

inherit rpm
