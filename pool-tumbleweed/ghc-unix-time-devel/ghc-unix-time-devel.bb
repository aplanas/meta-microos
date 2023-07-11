SUMMARY = "Haskell unix-time library development files"
DESCRIPTION = "This package provides the Haskell unix-time library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "ghc-unix-time-devel-0.4.9-1.6.aarch64.rpm"
RPM_HASH = "430019a6902adde3b15cd3fccd0dd4b8f25dfaa36c75e9e78386157e2a98af2e359708e143ca406211220c7aca2f0cf558290d2a85900279f7eafb6b279b5e22"

RPROVIDES:${PN} += "ghc-devel-unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0 \
ghc-unix-time-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-unix-time"

inherit rpm
