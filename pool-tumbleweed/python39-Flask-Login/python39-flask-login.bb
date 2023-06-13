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

RPM_NAME = "python39-Flask-Login-0.6.2-1.3.noarch.rpm"
RPM_HASH = "2057afc4193652bd671a32ed995a4bb62926e4c23d4e5eb767887c8fb504908d87d610a38024084c84c43c96ecda8585d65b47d6faa1a420a69d3b703a635103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-login) \
python39-Flask-Login \
python3dist(flask-login)"

RDEPENDS:${PN} += "python(abi) \
python39-Flask"

inherit rpm
