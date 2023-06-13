SUMMARY = "Haskell vector-th-unbox library development files"
DESCRIPTION = "This package provides the Haskell vector-th-unbox library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-vector-th-unbox-devel-0.2.2-4.2.aarch64.rpm"
RPM_HASH = "3ff33794ac69d02d86e79e24fbde2b2e165d5f4e553becb03a08d09008cdc5fafb6b4876f78e0db0ffc4e05d32eca7a5a4fbe511a89a77dc54430757185a9c67"

RPROVIDES:${PN} += "ghc-devel(vector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t) \
ghc-vector-th-unbox-devel \
ghc-vector-th-unbox-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-vector-th-unbox"

inherit rpm
