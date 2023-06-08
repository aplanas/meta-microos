SUMMARY = "Haskell Glob profiling library"
DESCRIPTION = "This package provides the Haskell Glob profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-prof-0.10.2-3.3.aarch64.rpm"
RPM_HASH = "f733253dfbcea2ddbbff069bf07df0e2dc95b0fb2eb50c1428a5c4a0dbd8cdfa4995c1e04cfebeace502825b8a3f3a2863ef7f6f2dd39e9109f0621e46ce438b"

RPROVIDES:${PN} += "ghc-Glob-prof ghc-Glob-prof(aarch-64) ghc-prof(Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R)"
RDEPENDS:${PN} += "ghc-Glob-devel ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(directory-1.3.7.1) ghc-prof(dlist-1.0-BmTLN13CmmLQvuHz7BjP9) ghc-prof(filepath-1.4.2.2) ghc-prof(transformers-0.5.6.2) ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
