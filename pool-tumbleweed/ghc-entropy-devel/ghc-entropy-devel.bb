SUMMARY = "Haskell entropy library development files"
DESCRIPTION = "This package provides the Haskell entropy library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-devel-0.4.1.10-3.4.aarch64.rpm"
RPM_HASH = "b10e19d5fdb91a28662ecb1ba55b22706849c0882f199ed0ce0cdbd1013f0cc51c0efd4083d81f7b3dee784fdc3513bf5617cdd3868c591eb3958704d64fe626"

RPROVIDES:${PN} += "ghc-devel-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-entropy-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-unix-2.7.3 \
ghc-entropy"

inherit rpm
