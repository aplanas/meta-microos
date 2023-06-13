SUMMARY = "Haskell setenv library documentation"
DESCRIPTION = "This package provides the Haskell setenv library documentation."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-doc-0.1.1.3-12.2.noarch.rpm"
RPM_HASH = "714bdacb06dcfc565a23954b71a10049b41c709f2abf67b24102b6961ce4deb698f715cb478e5681585a96ade4cd635d970adb7bf96e96737bceb28c5f7bf312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-setenv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
