SUMMARY = "Flask user session protection"
DESCRIPTION = "Flask-Paranoid is an extension for the Flask framework that protects the \
application against certain attacks in which the user session cookie is stolen \
and then used by the attacker. \
 \
The extension generates a 'paranoid' token according to the IP address and user \
agent when a client connects to the flask application."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-Flask-Paranoid-0.3.0-1.5.noarch.rpm"
RPM_HASH = "0c53a666bd3ea57c42941a70f2eb2f3090af8a1f0e91fee481306cd6882eb29559f88f7099d53436b8b66702c614e89cd30bb39232b6d4b2f67f82a798462060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-paranoid) \
python311-Flask-Paranoid \
python3dist(flask-paranoid)"
RDEPENDS:${PN} += "python(abi) \
python311-Flask"

inherit rpm
