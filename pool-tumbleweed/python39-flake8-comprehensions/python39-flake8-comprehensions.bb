SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.13.0"

RPM_NAME = "python39-flake8-comprehensions-3.13.0-1.1.noarch.rpm"
RPM_HASH = "be6f9e5b2a8515699f0f27a4737e4df6bd01f5c7ec176930b0f7ac89ebf2cce3f016b7077525d511e85c42857f39f603ff4b1b6ec24c2a4a7089a7b93107f2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-comprehensions \
python39-flake8-comprehensions \
python3dist-flake8-comprehensions"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
