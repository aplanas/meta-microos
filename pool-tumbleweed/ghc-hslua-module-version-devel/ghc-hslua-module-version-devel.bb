SUMMARY = "Haskell hslua-module-version library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-version library development \
files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-version-devel-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "0bee109caa4f5214fa6778edf04aa68a3949b4f2df54d214e7dc1286ce982d7454096d03c108c33de2c567f0332f34e568a647dffa3d57f60aba75aa888d23f5"

RPROVIDES:${PN} += "ghc-devel(hslua-module-version-1.1.0-LnOsxVbcWQY3m2SquoHReg) \
ghc-hslua-module-version-devel \
ghc-hslua-module-version-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-devel(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) \
ghc-devel(text-2.0.2) \
ghc-hslua-module-version"

inherit rpm
