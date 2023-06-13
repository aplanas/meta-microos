SUMMARY = "Small extension for Flask to make usage of Gravatar service"
DESCRIPTION = "Small extension for Flask to make usage of the Gravatar service."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-Flask-Gravatar-0.5.0-4.8.noarch.rpm"
RPM_HASH = "2ce090677dae7fa54ddf15753014cc681f4f79169ab60257eb9d7d66ad4cfbb3d8e296370cc624eca0bd5340053271eb7a8e7094d05b7d41b4588d7d615479b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Gravatar \
python3.10dist(flask-gravatar) \
python310-Flask-Gravatar \
python3dist(flask-gravatar)"

RDEPENDS:${PN} += "python(abi) \
python310-Flask"

inherit rpm
