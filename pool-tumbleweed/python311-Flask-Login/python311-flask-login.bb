SUMMARY = "User session management for Flask"
DESCRIPTION = "Flask-Login provides user session management for Flask. It handles the common \
tasks of logging in, logging out, and remembering your users' \
sessions over extended periods of time. \
 \
Flask-Login is not bound to any particular database system or permissions \
model. The only requirement is that your user objects implement a few \
methods, and that you provide a callback to the extension capable of \
loading users from their ID."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-Flask-Login-0.6.2-1.5.noarch.rpm"
RPM_HASH = "c7a89393bc8c1c5356269918c21cb107055ba5f05da1d29db3db329772d07e60bfe5d1333b28183f802fb261a5a1470f43469c7d6924a3bc81493753be6c76c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Login \
python3.11dist-flask-login \
python311-Flask-Login \
python3dist-flask-login"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
