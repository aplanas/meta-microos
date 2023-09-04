SUMMARY = "Haskell uglymemo library development files"
DESCRIPTION = "This package provides the Haskell uglymemo library development files."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-devel-0.1.0.1-4.3.aarch64.rpm"
RPM_HASH = "c47db18a354a2b010c4ec64f76c043a70d7b185ed4cd2c4fd0722abe836e0cfd155b7701add6f75ac215b371579d906e6bc668bd702587e2e04e879bd97c3cd9"

RPROVIDES:${PN} += "ghc-devel-uglymemo-0.1.0.1-FaxrSjBe3XhIHSfEZHhJ9C \
ghc-uglymemo-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-uglymemo"

inherit rpm
