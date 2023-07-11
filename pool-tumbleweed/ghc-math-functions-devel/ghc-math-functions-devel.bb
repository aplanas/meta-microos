SUMMARY = "Haskell math-functions library development files"
DESCRIPTION = "This package provides the Haskell math-functions library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-devel-0.3.4.2-2.6.aarch64.rpm"
RPM_HASH = "76619103980a127010c83e685df740139d35f36c0bf8a5a5229c72994486072b6f597b1e5a0691c51d011595cd57dbf74add4f731f75d1cf8d16f47f274081d3"

RPROVIDES:${PN} += "ghc-devel-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-math-functions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-math-functions"

inherit rpm
