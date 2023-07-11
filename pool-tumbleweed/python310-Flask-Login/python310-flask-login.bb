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

RPM_NAME = "python310-Flask-Login-0.6.2-1.5.noarch.rpm"
RPM_HASH = "2d049db8b78f531f3966692b265322365f0b5060d3bdb6b46690fb91614c0d420f6242002dd61df057528cd4fb245e943d0fc5ab1d87608ff60ed279ea81056c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-login \
python310-Flask-Login \
python3dist-flask-login"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
