SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-pylint-venv-3.0.2-1.1.noarch.rpm"
RPM_HASH = "6f31f73a019dcab1753e782aabb0d29fffce7102fca5075ac86968150bdd9da3ef5151bf6302f043d933f4b9a92b639d550355d7a8965ab0782490be6cec24b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylint-venv \
python39-pylint-venv \
python3dist-pylint-venv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
