SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python39-pytest-mock-3.11.1-1.1.noarch.rpm"
RPM_HASH = "3019e82241db096afbf39f6e720ad23d41c9e5f9b70820ad0560b7790614fd2dfadb01525c793a4a87545097e845aeae1dfef0eeb2688f8656d557cb70424afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-mock \
python39-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest"

inherit rpm
