SUMMARY = "Haskell DAV library development files"
DESCRIPTION = "This package provides the Haskell DAV library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-devel-1.3.4-4.4.aarch64.rpm"
RPM_HASH = "d378bd88b7457162a859d9982952f6d3e9e6ad19781f0cf0bad2f695ef1c1184151227a77343ccf7ac06e9c758e7ff02d4bd62b3c5cf192d5b132c689acc91e3"

RPROVIDES:${PN} += "ghc-DAV-devel \
ghc-DAV-devel(aarch-64) \
ghc-devel(DAV-1.3.4-BEfrmFzzS9e2tvTvjzH1rH)"
RDEPENDS:${PN} += "/bin/sh \
ghc-DAV \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-devel(containers-0.6.7) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215) \
ghc-devel(http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0) \
ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-devel(lens-5.2.2-2MO0prnPqCQBRfua8fH2Ea) \
ghc-devel(mtl-2.2.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) \
ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-devel(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) \
ghc-devel(xml-hamlet-0.5.0.2-IdxjO6rnbTj7Ym5G4XopFP)"

inherit rpm
