SUMMARY = "Haskell data-fix library development files"
DESCRIPTION = "This package provides the Haskell data-fix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.2"

RPM_NAME = "ghc-data-fix-devel-0.3.2-4.2.aarch64.rpm"
RPM_HASH = "05bee6af8c99893acbaec447ddd93135fde060ff918aa19186b618d0a3f0be25f8dc4283d40bf9627ab61e437cf15451f0c984a267f90af4559c080c658161e5"

RPROVIDES:${PN} += "ghc-data-fix-devel \
ghc-data-fix-devel(aarch-64) \
ghc-devel(data-fix-0.3.2-LdyR2jsAdh33KJZuVTGWPw)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-data-fix \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt)"

inherit rpm
