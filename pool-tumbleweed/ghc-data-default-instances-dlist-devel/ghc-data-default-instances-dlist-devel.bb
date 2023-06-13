SUMMARY = "Haskell data-default-instances-dlist library development files"
DESCRIPTION = "This package provides the Haskell data-default-instances-dlist library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-dlist-devel-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "f577f9f97e2093e934a009fc1fd8eeb8f034ced00d02ef25f3ac8fa5f970c8d72006526a08b6ac85f8f0b0f58d8ac4b410dae1da08123c092f8430cecd038ec1"

RPROVIDES:${PN} += "ghc-data-default-instances-dlist-devel \
ghc-data-default-instances-dlist-devel(aarch-64) \
ghc-devel(data-default-instances-dlist-0.0.1-Bmo6e1Lr8bt987tygJ1EBf)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-data-default-instances-dlist \
ghc-devel(base-4.17.1.0) \
ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-devel(dlist-1.0-BmTLN13CmmLQvuHz7BjP9)"

inherit rpm
