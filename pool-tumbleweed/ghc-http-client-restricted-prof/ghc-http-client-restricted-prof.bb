SUMMARY = "Haskell http-client-restricted profiling library"
DESCRIPTION = "This package provides the Haskell http-client-restricted profiling library."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-prof-0.0.5-2.3.aarch64.rpm"
RPM_HASH = "4209fc1ea47ec31de5fb3440b520c78a79d7211b4b9efe34c205dd8c6486460cab15c16a8c97df313a86713fcf9aeb7dfed23a881b40e29beafd5e4b291cd465"

RPROVIDES:${PN} += "ghc-http-client-restricted-prof \
ghc-prof-http-client-restricted-0.0.5-H9uptV4si451SzytuhF5eP"

RDEPENDS:${PN} += "ghc-http-client-restricted-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-connection-0.3.1-IDyFh0K8hgZvp3uiDVm7m \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215 \
ghc-prof-http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0 \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-prof-network-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q"

inherit rpm
