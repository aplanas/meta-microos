SUMMARY = "Haskell concurrent-output profiling library"
DESCRIPTION = "This package provides the Haskell concurrent-output profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.10.18"

RPM_NAME = "ghc-concurrent-output-prof-1.10.18-1.6.aarch64.rpm"
RPM_HASH = "1f7c7d13fedcfb3a9a5e30aaf2d7ec9d79fb6743ef82f27b9d1b182d62cade57314e615a7bb7fd1e06790e06f785a7497c6d9be74303b4cd3e6cec98f3453dee"

RPROVIDES:${PN} += "ghc-concurrent-output-prof \
ghc-prof-concurrent-output-1.10.18-7mD57bQUyK62aUS02yxnhe"

RDEPENDS:${PN} += "ghc-concurrent-output-devel \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-process-1.6.17.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-terminal-size-0.3.4-3vDBLsxBXgoFiFoFBqm3N8 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
