SUMMARY = "Haskell criterion-measurement library development files"
DESCRIPTION = "This package provides the Haskell criterion-measurement library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-devel-0.2.1.0-1.4.aarch64.rpm"
RPM_HASH = "28a961a7b6940be664b592f36b78fd5367b3b951adb6c70761da148e17e03898702b387d121b0382189c264d915250b28b850eb2cabd2f07699be8220793a5cb"

RPROVIDES:${PN} += "ghc-criterion-measurement-devel \
ghc-devel-criterion-measurement-0.2.1.0-DbdcwZpcXTnArPRmwcriLh"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-criterion-measurement \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
