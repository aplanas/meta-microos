SUMMARY = "Small extension for Flask to make usage of Gravatar service"
DESCRIPTION = "Small extension for Flask to make usage of the Gravatar service."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-Flask-Gravatar-0.5.0-4.8.noarch.rpm"
RPM_HASH = "3ec675cf71c78414849623dc86749aa1b020d520e2061dba0d7719ee5771c0f20262dcb92012fad084fe421106227e67a2857be43b3ca85023e41e4a9647eb72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-gravatar \
python311-Flask-Gravatar \
python3dist-flask-gravatar"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
