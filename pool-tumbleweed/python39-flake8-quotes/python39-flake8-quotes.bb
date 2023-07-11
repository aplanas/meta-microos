SUMMARY = "Flake8 lint for quotes"
DESCRIPTION = "Flake8 Extension to lint for quotes."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "python39-flake8-quotes-3.3.2-1.5.noarch.rpm"
RPM_HASH = "457ce6bdd8c8e2576822507ab3d6ec2e8a96c7122b2849c02cdf49b792716358e927b900824361470acb1193e97705ecd4de8d9858c4e05c372dc47f72c5d91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-quotes \
python39-flake8-quotes \
python3dist-flake8-quotes"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
