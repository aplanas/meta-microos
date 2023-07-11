SUMMARY = "Small extension for Flask to make usage of Gravatar service"
DESCRIPTION = "Small extension for Flask to make usage of the Gravatar service."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-Flask-Gravatar-0.5.0-4.10.noarch.rpm"
RPM_HASH = "37a39ec4d3343eece96a712b3667d30785c20b5be7812dc1b99cd6a6e825527b5ba98ce685837c9528ce435e666cee98e28d7ca9eee00fcad189c00fd35b1a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-gravatar \
python39-Flask-Gravatar \
python3dist-flask-gravatar"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
