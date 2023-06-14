SUMMARY = "Haskell lukko library development files"
DESCRIPTION = "This package provides the Haskell lukko library development files."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-devel-0.1.1.3-5.3.aarch64.rpm"
RPM_HASH = "3238aad7fb2fd46e750e1fb899954f84b29a23f74edf3797ecdc2c9b58df613e233ebd1eb7fc07a80f4195a098edcde6b54405da56a02d8450565ac00e2a3ded"

RPROVIDES:${PN} += "ghc-devel-lukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V \
ghc-lukko-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-lukko"

inherit rpm
