SUMMARY = "Haskell DAV library development files"
DESCRIPTION = "This package provides the Haskell DAV library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-devel-1.3.4-4.6.aarch64.rpm"
RPM_HASH = "37f67cd23dccd856095020bc4afa46136db7d20c6f4aa774f97a504dcacb0a76eacd6cc45cd548d6ebb09c252bc61248509bd6ee7bbb555531d56325fd43475c"

RPROVIDES:${PN} += "ghc-DAV-devel \
ghc-devel-DAV-1.3.4-IOGA2r0PR825zqrnrMRk67"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-DAV \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-exceptions-0.10.5 \
ghc-devel-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-devel-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-lens-5.2.2-1olZqltPpYqDYPXthdjXjf \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-devel-xml-hamlet-0.5.0.2-9plFeNSOBanqhTw6DrwhP"

inherit rpm
