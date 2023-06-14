SUMMARY = "Haskell x509-system library development files"
DESCRIPTION = "This package provides the Haskell x509-system library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-devel-1.6.7-2.3.aarch64.rpm"
RPM_HASH = "d3145b5407c7dd9e1c158d687ee5dd6cb82a86c0886028f8da17e4a5ece9a0facee231b9b3e88827a1cd56f49404b82ec01644accbe6842c26eb008615ec80c0"

RPROVIDES:${PN} += "ghc-devel-x509-system-1.6.7-BOgSBhUS7jg4riLu2Dt4H7 \
ghc-x509-system-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns \
ghc-devel-process-1.6.16.0 \
ghc-devel-x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw \
ghc-devel-x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt \
ghc-x509-system"

inherit rpm
