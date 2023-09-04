SUMMARY = "Haskell fsnotify library development files"
DESCRIPTION = "This package provides the Haskell fsnotify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.0"

RPM_NAME = "ghc-fsnotify-devel-0.4.1.0-2.10.aarch64.rpm"
RPM_HASH = "d02879cfa141dbacb23176324c94e7028030f1d1015a1e4b964557c8e5affffa3e31fffa7edf78c3a82c451ef7e64cdc16ca142d31eecc080cf5fbecc648a46e"

RPROVIDES:${PN} += "ghc-devel-fsnotify-0.4.1.0-DXk16Cfx5AnBy7sgJP2ZHN \
ghc-fsnotify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hinotify-0.4.1-JFQ6DOM0mgyCikOfj8YmfP \
ghc-devel-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-devel-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-fsnotify"

inherit rpm
