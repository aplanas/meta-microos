SUMMARY = "Haskell cookie library development files"
DESCRIPTION = "This package provides the Haskell cookie library development files."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "ghc-cookie-devel-0.4.6-2.2.aarch64.rpm"
RPM_HASH = "2d7df69ac652f1e9b395031058cb0c4788065e0856f065ed43941ed3847c5a2c5241e0544c7fb9fa48a3449ad7daa6e18083c943252646c9ede3d9643d4d91c4"

RPROVIDES:${PN} += "ghc-cookie-devel ghc-cookie-devel(aarch-64) ghc-devel(cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-cookie ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) ghc-devel(deepseq-1.4.8.0) ghc-devel(text-2.0.2) ghc-devel(time-1.12.2)"

inherit rpm
