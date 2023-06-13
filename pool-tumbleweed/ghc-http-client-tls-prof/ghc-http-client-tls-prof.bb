SUMMARY = "Haskell http-client-tls profiling library"
DESCRIPTION = "This package provides the Haskell http-client-tls profiling library."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-prof-0.3.6.1-2.3.aarch64.rpm"
RPM_HASH = "742c51c6901bab0fd46b2aa21ff69c645c721ec818266d2da5ac3a70df294714b76340e895761a8de897cff21035c3277be2cda8867e876bdfabd1431af21a4d"

RPROVIDES:${PN} += "ghc-http-client-tls-prof \
ghc-http-client-tls-prof(aarch-64) \
ghc-prof(http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0)"

RDEPENDS:${PN} += "ghc-http-client-tls-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-prof(connection-0.3.1-IDyFh0K8hgZvp3uiDVm7m) \
ghc-prof(containers-0.6.7) \
ghc-prof(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) \
ghc-prof(text-2.0.2) \
ghc-prof(tls-1.6.0-48osxqPawrs8SblkErmTaM) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
