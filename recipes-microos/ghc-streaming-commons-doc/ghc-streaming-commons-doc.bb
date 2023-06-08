SUMMARY = "Haskell streaming-commons library documentation"
DESCRIPTION = "This package provides the Haskell streaming-commons library documentation."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-doc-0.2.2.6-1.3.noarch.rpm"
RPM_HASH = "386a67e643a58a88840a05bc502ec2b61abcc8a57ebe160c32dc688a9592eed300d6ffd319c98998e5368f0a61aeb1b895d551bdacdcbd74c33c1cc35f6045f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-streaming-commons-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
