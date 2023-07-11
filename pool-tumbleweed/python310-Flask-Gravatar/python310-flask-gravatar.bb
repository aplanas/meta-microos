SUMMARY = "Small extension for Flask to make usage of Gravatar service"
DESCRIPTION = "Small extension for Flask to make usage of the Gravatar service."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-Flask-Gravatar-0.5.0-4.10.noarch.rpm"
RPM_HASH = "639a97e08f9f7e48117d82acc9c7b4f28861b98f0e225026770815e73ac2286065df2f4572e52a218c619e4b4c5823b17f40d246ca2d3225eecb6bcf88056369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-gravatar \
python310-Flask-Gravatar \
python3dist-flask-gravatar"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
