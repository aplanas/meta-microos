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

RPM_NAME = "python310-Flask-Login-0.6.2-1.3.noarch.rpm"
RPM_HASH = "88d31c96aaa803eb3606e98b9fc5ad59fb13c29b0d054995d642f5b8f20f8f0378501933f562a7d1c70a17c1d9a4762f7c3130169e6eb9ab36bc00e534c0f40d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Login \
python3.10dist-flask-login \
python310-Flask-Login \
python3dist-flask-login"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
