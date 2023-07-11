SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python39-pytest-sugar-0.9.7-1.3.noarch.rpm"
RPM_HASH = "9a7c791bbc8739bbd0abdc530747e07e30926de5a8d19224a4bb2a981688b5a5499aaf100a4c3edc5b4173b9446a1eaa5cc0c759b98803f35bb645eea789de99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-sugar \
python39-pytest-sugar \
python3dist-pytest-sugar"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-termcolor"

inherit rpm
