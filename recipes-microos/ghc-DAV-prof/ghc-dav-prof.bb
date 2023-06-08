SUMMARY = "Haskell DAV profiling library"
DESCRIPTION = "This package provides the Haskell DAV profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-prof-1.3.4-4.4.aarch64.rpm"
RPM_HASH = "840bca385d75ad61d100d1b685d61a1d24e03887e90809cad9cbee2e0f5a31136b8088cd86f917e2dbc866acd2e5db4c3683efbc9d13a57e43ef00102c1eb961"

RPROVIDES:${PN} += "ghc-DAV-prof ghc-DAV-prof(aarch-64) ghc-prof(DAV-1.3.4-BEfrmFzzS9e2tvTvjzH1rH)"
RDEPENDS:${PN} += "ghc-DAV-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) ghc-prof(containers-0.6.7) ghc-prof(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) ghc-prof(exceptions-0.10.5) ghc-prof(http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215) ghc-prof(http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0) ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) ghc-prof(lens-5.2.2-2MO0prnPqCQBRfua8fH2Ea) ghc-prof(mtl-2.2.2) ghc-prof(transformers-0.5.6.2) ghc-prof(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) ghc-prof(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) ghc-prof(xml-hamlet-0.5.0.2-IdxjO6rnbTj7Ym5G4XopFP)"

inherit rpm
