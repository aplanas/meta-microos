SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python39-pytest-sugar-0.9.7-1.1.noarch.rpm"
RPM_HASH = "872cb84b5da46126ba640e1d540e568a0999344f732a4f8d42b72a8169938339534887b582558f0affeaef96f7cc5861e4156f19d52b20773fb039cd7e073021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-sugar) \
python39-pytest-sugar \
python3dist(pytest-sugar)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest \
python39-termcolor"

inherit rpm
