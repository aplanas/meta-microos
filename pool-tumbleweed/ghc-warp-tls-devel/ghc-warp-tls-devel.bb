SUMMARY = "Haskell warp-tls library development files"
DESCRIPTION = "This package provides the Haskell warp-tls library development files."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-devel-3.3.6-1.6.aarch64.rpm"
RPM_HASH = "98deabbf50541c734d6500548b572f808aba24f17ee57bdf15ab99a9843b8ae63d97810887d4808815980fa4c30a6a0981b58b9928cd8522217d5f78fc4bbd65"

RPROVIDES:${PN} += "ghc-devel-warp-tls-3.3.6-84GlfJc6pctLoCFIjkFOFZ \
ghc-warp-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-recv-0.1.0-5l0GOJwksOA59K6H5tIdgO \
ghc-devel-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-devel-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-devel-tls-session-manager-0.0.4-H4ntEZmH6lq6RcNU9soHmP \
ghc-devel-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-warp-3.3.25-7qOcByHeVpuMAFF4vrupa \
ghc-warp-tls"

inherit rpm
