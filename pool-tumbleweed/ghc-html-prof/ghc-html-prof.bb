SUMMARY = "Haskell html profiling library"
DESCRIPTION = "This package provides the Haskell html profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-prof-1.0.1.2-4.2.aarch64.rpm"
RPM_HASH = "28b78d2cb9549a4d9d027830180c3613d2750b7ae0827be424e81f32f057fb7494fd06c0898aae440ea8dcc8d35495514982ef1c4f0a55893498af6f9c0dc8ca"

RPROVIDES:${PN} += "ghc-html-prof \
ghc-prof-html-1.0.1.2-U7qWIp0bJwCnAFPlj3UZy"

RDEPENDS:${PN} += "ghc-html-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
