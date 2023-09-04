SUMMARY = "Haskell x509-validation library documentation"
DESCRIPTION = "This package provides the Haskell x509-validation library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-doc-1.6.12-2.8.noarch.rpm"
RPM_HASH = "1e0178ccac9cb1ad2ace4cc6b36fae4eabe9dea04556191412c430ddd55d7b8f22c0d58ab65a4187c8f24f925869957bed9532f01e0a65eb3f44c2f33cda0bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-validation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
