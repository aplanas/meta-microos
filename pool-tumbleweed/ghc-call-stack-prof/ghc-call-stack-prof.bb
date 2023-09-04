SUMMARY = "Haskell call-stack profiling library"
DESCRIPTION = "This package provides the Haskell call-stack profiling library."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-prof-0.4.0-2.8.aarch64.rpm"
RPM_HASH = "eee3fae25b1f3393077227db18adff0e1d01316adc3e7d19ed27e8c10b03f7662f93e192813cb7021d405053d4b44416cdce9e631342637b5d653bf5ec2b63f5"

RPROVIDES:${PN} += "ghc-call-stack-prof \
ghc-prof-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt"

RDEPENDS:${PN} += "ghc-call-stack-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
