SUMMARY = "Haskell Glob library development files"
DESCRIPTION = "This package provides the Haskell Glob library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-devel-0.10.2-3.3.aarch64.rpm"
RPM_HASH = "3e4ec11b14e24127fd97c2990fc73b065dea5c729bbf2e1b60c8cbe775336d05a66d8be11bb284957906dec74e668033ee8f39bb75e8ac406cf18fa8ddbda91a"

RPROVIDES:${PN} += "ghc-Glob-devel ghc-Glob-devel(aarch-64) ghc-devel(Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R)"
RDEPENDS:${PN} += "/bin/sh ghc-Glob ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(directory-1.3.7.1) ghc-devel(dlist-1.0-BmTLN13CmmLQvuHz7BjP9) ghc-devel(filepath-1.4.2.2) ghc-devel(transformers-0.5.6.2) ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
