SUMMARY = "Haskell hslua-classes library development files"
DESCRIPTION = "This package provides the Haskell hslua-classes library development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-devel-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "4840bc64338f176df9e3068a2c1e0607e50dcb1578671136c10dedb3f62d977c71b4bf9d2ec121f3a102c2119daf9c7fc223d27e1e17404ceddf4b72921aad32"

RPROVIDES:${PN} += "ghc-devel(hslua-classes-2.3.0-FmFATpNcre9GneTlejjsY7) \
ghc-hslua-classes-devel \
ghc-hslua-classes-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-devel(text-2.0.2) \
ghc-hslua-classes"

inherit rpm
