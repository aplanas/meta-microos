SUMMARY = "Python ordered, dynamically-expandable dot-access dictionary"
DESCRIPTION = "Python ordered, dynamically-expandable dot-access dictionary."
LICENSE = "MIT"

PV = "1.3.30"

RPM_NAME = "python310-dotmap-1.3.30-1.4.noarch.rpm"
RPM_HASH = "80ced5571ca84cb2058f08558384f7c18f7f3cd4186277931f41d7df5ddb7a546f7b70afc97ad4ac6db8f38fdf195c6712f0aa04b227049368fc03f751eb0241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dotmap \
python310-dotmap \
python3dist-dotmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
