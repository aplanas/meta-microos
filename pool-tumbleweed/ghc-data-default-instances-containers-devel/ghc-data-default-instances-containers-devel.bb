SUMMARY = "Haskell data-default-instances-containers library development files"
DESCRIPTION = "This package provides the Haskell data-default-instances-containers library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-containers-devel-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "9f9e13cde785eaa197555e538b74d26375afe7c912d8ce25037053b1c37e63c437ebbcc94cb4431ba553e688883a5e5245c7bf0436f72d80ad9d9221486a9aa3"

RPROVIDES:${PN} += "ghc-data-default-instances-containers-devel \
ghc-devel-data-default-instances-containers-0.0.1-GsTPO88BTeU5gVKxrRffFz"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-default-instances-containers \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ"

inherit rpm
