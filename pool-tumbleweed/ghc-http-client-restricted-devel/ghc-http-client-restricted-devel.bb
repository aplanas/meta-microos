SUMMARY = "Haskell http-client-restricted library development files"
DESCRIPTION = "This package provides the Haskell http-client-restricted library \
development files."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-devel-0.0.5-2.3.aarch64.rpm"
RPM_HASH = "42d008ff152dd182798eb4d793bfa27378266e000ffae67d4abd84ae96761ceab0d7757d29e10d8a14c76fa2a4a5921b0aefb129e3bbc19aedb9cf4a91510e35"

RPROVIDES:${PN} += "ghc-devel(http-client-restricted-0.0.5-H9uptV4si451SzytuhF5eP) \
ghc-http-client-restricted-devel \
ghc-http-client-restricted-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(connection-0.3.1-IDyFh0K8hgZvp3uiDVm7m) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-devel(http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215) \
ghc-devel(http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-devel(network-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-http-client-restricted"

inherit rpm
