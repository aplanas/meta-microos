SUMMARY = "Haskell iproute library development files"
DESCRIPTION = "This package provides the Haskell iproute library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-devel-1.7.12-2.3.aarch64.rpm"
RPM_HASH = "2bc2615f45247c5ae5d320210e39cf5c3719ad8a7af25b5de64ff52ba34780338306d1e3913dbc7e2a3f4b202194c35a26c5329f79fdff71c54faebde2b2231b"

RPROVIDES:${PN} += "ghc-devel(iproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd) \
ghc-iproute-devel \
ghc-iproute-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(appar-0.1.8-JYpyJYPkUOgKorqU8WSWRv) \
ghc-devel(base-4.17.1.0) \
ghc-devel(byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-iproute"

inherit rpm
