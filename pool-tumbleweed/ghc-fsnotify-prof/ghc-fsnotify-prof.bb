SUMMARY = "Haskell fsnotify profiling library"
DESCRIPTION = "This package provides the Haskell fsnotify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.0"

RPM_NAME = "ghc-fsnotify-prof-0.4.1.0-2.10.aarch64.rpm"
RPM_HASH = "e86361d6f07790b5aa3f250152dd633fc2591618e30669e0b74b044e6b38460c6d849cd2d0bb3e5b573284f1fc0aee8ef5678a98195b15d6087fe6f9d3cb6926"

RPROVIDES:${PN} += "ghc-fsnotify-prof \
ghc-prof-fsnotify-0.4.1.0-DXk16Cfx5AnBy7sgJP2ZHN"

RDEPENDS:${PN} += "ghc-fsnotify-devel \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hinotify-0.4.1-JFQ6DOM0mgyCikOfj8YmfP \
ghc-prof-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-prof-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei"

inherit rpm
