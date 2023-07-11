SUMMARY = "Haskell some library development files"
DESCRIPTION = "This package provides the Haskell some library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-devel-1.0.5-1.6.aarch64.rpm"
RPM_HASH = "0937f08642879cf6f6d80d7496c1760c3782981c1da5eb0993713ed668a1568a3917adb76988a36ff7980c1114353764949dc80e3c1f688361ad6f2ee48f8ed2"

RPROVIDES:${PN} += "ghc-devel-some-1.0.5-3dwCpkSImpx8T8axxRPR3Z \
ghc-some-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-some"

inherit rpm
