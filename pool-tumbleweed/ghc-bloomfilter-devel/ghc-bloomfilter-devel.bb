SUMMARY = "Haskell bloomfilter library development files"
DESCRIPTION = "This package provides the Haskell bloomfilter library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.0"

RPM_NAME = "ghc-bloomfilter-devel-2.0.1.0-6.6.aarch64.rpm"
RPM_HASH = "b5a9938e618bc06b5a27b3a6ecf7b71b270297949f8779cc18aa0d675138c0573c0f9df4f251ea3aef15472a815ba120ab45d40f23be438d8377b7c4e049a9d7"

RPROVIDES:${PN} += "ghc-bloomfilter-devel \
ghc-devel-bloomfilter-2.0.1.0-3hF1ySDPbPQA7KQQeHgCqI"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bloomfilter \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
