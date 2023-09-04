SUMMARY = "Haskell hslua-repl library development files"
DESCRIPTION = "This package provides the Haskell hslua-repl library development files."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-hslua-repl-devel-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "6fa56be8a9b3aa6ecfc06a31c2823943b05c53d19140eafd965a4469b9f45b49b9d72e64a7f4f5db5fec616e17c4507e91b3c1607f3336e4b3efd9fdea1ffe20"

RPROVIDES:${PN} += "ghc-devel-hslua-repl-0.1.1-AT3e5G0H4So5vj4IgGLSDC \
ghc-hslua-repl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-isocline-1.0.9-5gDpTZgmtmsDJNf9j9fI7b \
ghc-devel-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-devel-text-2.0.2 \
ghc-hslua-repl"

inherit rpm
