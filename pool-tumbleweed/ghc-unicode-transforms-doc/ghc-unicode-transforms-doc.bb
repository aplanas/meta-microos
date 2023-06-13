SUMMARY = "Haskell unicode-transforms library documentation"
DESCRIPTION = "This package provides the Haskell unicode-transforms library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-doc-0.4.0.1-4.3.noarch.rpm"
RPM_HASH = "c472d85396db0d9697352bfc56d94d41f9f1d06dba3672b913122b727b6d093727022ce95b771ad6bc6fbb5e6a8ac8e3d14ebae32bad6f7d686e1918fd9f3f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-transforms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
