SUMMARY = "Haskell hslua-module-system library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-system library development \
files."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-system-devel-1.1.0.1-1.2.aarch64.rpm"
RPM_HASH = "b1d95370b048ddfad525f1d4b573bc94f96287e88e23375d51938bcae1f232d07926dcd89ad757c26aae0be8944ac4c8d7fb60f5b76e90261d0f40b22718be05"

RPROVIDES:${PN} += "ghc-devel(hslua-module-system-1.1.0.1-7243M7wFNHXL9pjhXYmDQK) \
ghc-hslua-module-system-devel \
ghc-hslua-module-system-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-devel(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) \
ghc-devel(temporary-1.3-9rLWZg49Shk3gKExST32p) \
ghc-devel(text-2.0.2) \
ghc-hslua-module-system"

inherit rpm
