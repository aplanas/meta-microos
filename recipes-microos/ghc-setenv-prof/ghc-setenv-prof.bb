SUMMARY = "Haskell setenv profiling library"
DESCRIPTION = "This package provides the Haskell setenv profiling library."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-prof-0.1.1.3-12.2.aarch64.rpm"
RPM_HASH = "0a399918268d7e1318ef7e69d4b7bfa2bc951a18dec8b828747641b21dee1faa8b5ee3e64dad8dca2fe5f4bbc5004ee96dba882e21f206dee48a10767c3695db"

RPROVIDES:${PN} += "ghc-prof(setenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x) ghc-setenv-prof ghc-setenv-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(unix-2.7.3) ghc-setenv-devel"

inherit rpm
