SUMMARY = "Haskell DAV profiling library"
DESCRIPTION = "This package provides the Haskell DAV profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-prof-1.3.4-4.6.aarch64.rpm"
RPM_HASH = "24e11c50b8d9162b8dd0a5fa7a0cfb58f69ccd21c7487b34f527e86542f2fdaaf0499fb9975d9dcd06b6f7a6fa261b212df837966fed7593b85992cfc8e96ef8"

RPROVIDES:${PN} += "ghc-DAV-prof \
ghc-prof-DAV-1.3.4-IOGA2r0PR825zqrnrMRk67"

RDEPENDS:${PN} += "ghc-DAV-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-exceptions-0.10.5 \
ghc-prof-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-prof-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-lens-5.2.2-1olZqltPpYqDYPXthdjXjf \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-prof-xml-hamlet-0.5.0.2-9plFeNSOBanqhTw6DrwhP"

inherit rpm
