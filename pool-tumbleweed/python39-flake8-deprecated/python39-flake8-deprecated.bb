SUMMARY = "Flake8 deprecations plugin"
DESCRIPTION = "This flake8 plugin helps you keeping up with method deprecations and giving hints about what \
they should be replaced with."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "python39-flake8-deprecated-2.0.1-1.3.noarch.rpm"
RPM_HASH = "797b8e6b9a4b64dde1b2acd84840bb41ef0351fae09116cf24fef6ab41233721413d31a56102099c617583aa6b49a7e2a963603b434b395cc67707d605da1887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-deprecated) \
python39-flake8-deprecated \
python3dist(flake8-deprecated)"
RDEPENDS:${PN} += "python(abi) \
python39-flake8"

inherit rpm
