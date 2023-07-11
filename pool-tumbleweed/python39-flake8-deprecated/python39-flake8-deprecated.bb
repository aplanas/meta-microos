SUMMARY = "Flake8 deprecations plugin"
DESCRIPTION = "This flake8 plugin helps you keeping up with method deprecations and giving hints about what \
they should be replaced with."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "python39-flake8-deprecated-2.0.1-1.5.noarch.rpm"
RPM_HASH = "3187ae0a889c49a48f009fdd217d119b9429ae76f6b941837683a279cd7179eb0e5d580c5c52aa4c63b1df5a8e44f58ef879b71e4ba4e1523ac1bb05c4fa1c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-deprecated \
python39-flake8-deprecated \
python3dist-flake8-deprecated"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
