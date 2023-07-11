SUMMARY = "Fish Completion for conftest"
DESCRIPTION = "Fish command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.43.1"

RPM_NAME = "conftest-fish-completion-0.43.1-1.1.noarch.rpm"
RPM_HASH = "88fc75ee6a183fb20c97d54a6627dd75244a8c36ddc3aee414b18cef5f815dfb45b8f7a9b95891f680a510e773641b6bbaa27bc1d040b6e715595aae2bd3051b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-fish-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
