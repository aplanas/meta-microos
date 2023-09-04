SUMMARY = "Haskell base-unicode-symbols library development files"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-devel-0.2.4.2-1.3.aarch64.rpm"
RPM_HASH = "98578dca5b97bf57009595941f2793883dfe3fefda6eead6730e1d9a98ebc5ca308ed41a32fc28e94a0527d2ac9b83116f73f636a4883336d20cf0dde528e201"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-devel \
ghc-devel-base-unicode-symbols-0.2.4.2-AsBlETXXS2UHsp6FZL7O0P"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-unicode-symbols \
ghc-compiler \
ghc-devel-base-4.17.2.0"

inherit rpm
