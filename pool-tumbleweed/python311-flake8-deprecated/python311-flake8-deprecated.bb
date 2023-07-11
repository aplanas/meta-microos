SUMMARY = "Flake8 deprecations plugin"
DESCRIPTION = "This flake8 plugin helps you keeping up with method deprecations and giving hints about what \
they should be replaced with."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "python311-flake8-deprecated-2.0.1-1.5.noarch.rpm"
RPM_HASH = "368f9271044a66a7c06e7983b4af85439c8a56bc8c1dd99ef69d500314db8320eedf64b93e7e32e6ba57e34e85216b490ec2c4807f3c7d7ee631f065b5ce788f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-deprecated \
python3.11dist-flake8-deprecated \
python311-flake8-deprecated \
python3dist-flake8-deprecated"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
