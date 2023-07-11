SUMMARY = "Flake8 lint for quotes"
DESCRIPTION = "Flake8 Extension to lint for quotes."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "python310-flake8-quotes-3.3.2-1.5.noarch.rpm"
RPM_HASH = "4afd0609c75dcba2bdfebf4563caedfaff44c2990fcd46d2dc6334b98f981ef5775a7c0b19371ba435177e879f1da49a6f92f1c5e6b31170fa36d683f0a6fef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-quotes \
python310-flake8-quotes \
python3dist-flake8-quotes"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
