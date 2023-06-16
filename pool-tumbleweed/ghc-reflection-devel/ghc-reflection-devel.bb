SUMMARY = "Haskell reflection library development files"
DESCRIPTION = "This package provides the Haskell reflection library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-reflection-devel-2.1.7-1.2.aarch64.rpm"
RPM_HASH = "1655349eb5a1ef832ad569549e48dba7a1aaafc52ad97315410cb8bf8b52ec4138229a4dbb8ba787170090b9a463886f692c5d53fa519c83dc3532d800947d4f"

RPROVIDES:${PN} += "ghc-devel-reflection-2.1.7-KcOWE7PS1mHy6gA2edHvV \
ghc-reflection-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-reflection"

inherit rpm
