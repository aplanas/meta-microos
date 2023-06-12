SUMMARY = "Haskell microstache profiling library"
DESCRIPTION = "This package provides the Haskell microstache profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-prof-1.0.2.3-2.3.aarch64.rpm"
RPM_HASH = "75857963cad91c9aaaad375942b398fcddd264c18e235a0d42281949f4bc9ef3c3279bdc65fc8fde8f79b913c7dcbc77d21cd418d52daa4cd56f7e6d30df58dd"

RPROVIDES:${PN} += "ghc-microstache-prof \
ghc-microstache-prof(aarch-64) \
ghc-prof(microstache-1.0.2.3-AHAKnK06lT6DHccapktUKL)"
RDEPENDS:${PN} += "ghc-microstache-devel \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(text-2.0.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
