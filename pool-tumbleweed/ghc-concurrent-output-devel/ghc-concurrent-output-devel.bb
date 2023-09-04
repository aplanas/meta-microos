SUMMARY = "Haskell concurrent-output library development files"
DESCRIPTION = "This package provides the Haskell concurrent-output library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.10.18"

RPM_NAME = "ghc-concurrent-output-devel-1.10.18-1.6.aarch64.rpm"
RPM_HASH = "de313d511ab259465e6bdc9f428260f901b7e116d76e988a113820f04049e347a176bf7bd3360619f1e5face68d48fe0ca68e3720dc8ebfe1bfbfdfe4cfbcb05"

RPROVIDES:${PN} += "ghc-concurrent-output-devel \
ghc-devel-concurrent-output-1.10.18-7mD57bQUyK62aUS02yxnhe"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-concurrent-output \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-process-1.6.17.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-terminal-size-0.3.4-3vDBLsxBXgoFiFoFBqm3N8 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3"

inherit rpm
