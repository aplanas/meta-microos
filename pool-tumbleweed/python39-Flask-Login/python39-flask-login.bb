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

RPM_NAME = "python39-Flask-Login-0.6.2-1.5.noarch.rpm"
RPM_HASH = "922a6c64b27fef2c2a5302f86562963d0e7846449b1da4247b5b01862423e6a6fa68819447d5b6db6708cc5980ce004b5ea2a2a0421e4783eb9b51a357ecfefc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-login \
python39-Flask-Login \
python3dist-flask-login"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
