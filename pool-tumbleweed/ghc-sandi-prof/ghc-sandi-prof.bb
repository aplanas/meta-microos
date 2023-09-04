SUMMARY = "Haskell sandi profiling library"
DESCRIPTION = "This package provides the Haskell sandi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-prof-0.5-5.11.aarch64.rpm"
RPM_HASH = "249ea421d49b10588d0a7c37745c857e4d68a5a3f0be4a08dfd65989ab3c4e0e08f68278f45d7c663a0a44cd7cbe38c1ad5748039749fc782ebb77c6b604ff8f"

RPROVIDES:${PN} += "ghc-prof-sandi-0.5-4V55ws6mOby4WWuCXz9My4 \
ghc-sandi-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-exceptions-0.10.5 \
ghc-sandi-devel"

inherit rpm
