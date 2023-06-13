SUMMARY = "Haskell x509-system profiling library"
DESCRIPTION = "This package provides the Haskell x509-system profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-prof-1.6.7-2.3.aarch64.rpm"
RPM_HASH = "b705adb3c31bf69cea65be671e3ecbc40ee98582abfd9e1091b33c36507a096c3ca58ac1f0faf9f914e30c66180744e7da53aee3e634ebb4874fad77f1649e84"

RPROVIDES:${PN} += "ghc-prof(x509-system-1.6.7-BOgSBhUS7jg4riLu2Dt4H7) \
ghc-x509-system-prof \
ghc-x509-system-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(mtl-2.2.2) \
ghc-prof(pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns) \
ghc-prof(process-1.6.16.0) \
ghc-prof(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) \
ghc-prof(x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt) \
ghc-x509-system-devel"

inherit rpm
