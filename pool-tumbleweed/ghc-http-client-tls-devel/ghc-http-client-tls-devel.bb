SUMMARY = "Haskell http-client-tls library development files"
DESCRIPTION = "This package provides the Haskell http-client-tls library development \
files."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-devel-0.3.6.1-2.3.aarch64.rpm"
RPM_HASH = "be16867a4e3eecd2ff73c21b876f61ef6a14dce48c2b142a8ff401ca1e1d573fdb8068026357cc402f70db89a49cea0c234eb5b3de94dc1a9c79d1e4ea101e73"

RPROVIDES:${PN} += "ghc-devel-http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0 \
ghc-http-client-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-connection-0.3.1-IDyFh0K8hgZvp3uiDVm7m \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-exceptions-0.10.5 \
ghc-devel-http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215 \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL \
ghc-devel-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-text-2.0.2 \
ghc-devel-tls-1.6.0-48osxqPawrs8SblkErmTaM \
ghc-devel-transformers-0.5.6.2 \
ghc-http-client-tls"

inherit rpm
