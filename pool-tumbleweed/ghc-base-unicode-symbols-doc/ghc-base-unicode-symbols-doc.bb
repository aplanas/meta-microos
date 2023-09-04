SUMMARY = "Haskell base-unicode-symbols library documentation"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-doc-0.2.4.2-1.3.noarch.rpm"
RPM_HASH = "f67c3a5d3a10571cd9f73608fd0496b69acfece0dff69f6f1768ae4765d73d69eb925b4a2eca8351685c77294dd7adbf8c72d9af8c358cf6f691ffbf2a65db3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
