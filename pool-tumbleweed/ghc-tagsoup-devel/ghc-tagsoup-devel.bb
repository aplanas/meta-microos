SUMMARY = "Haskell tagsoup library development files"
DESCRIPTION = "This package provides the Haskell tagsoup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-devel-0.14.8-6.3.aarch64.rpm"
RPM_HASH = "226d9f6a18db705ffeb4b294b6dd2c4786c6e3f04293fc54ae7bc0d1e580304b9947a7851f850caf4176194aa1b86ee8af17e3f8a17e77bb869f040218225b25"

RPROVIDES:${PN} += "ghc-devel-tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn \
ghc-tagsoup-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-tagsoup"

inherit rpm
