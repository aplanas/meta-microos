SUMMARY = "Flask user session protection"
DESCRIPTION = "Flask-Paranoid is an extension for the Flask framework that protects the \
application against certain attacks in which the user session cookie is stolen \
and then used by the attacker. \
 \
The extension generates a 'paranoid' token according to the IP address and user \
agent when a client connects to the flask application."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-Flask-Paranoid-0.3.0-1.7.noarch.rpm"
RPM_HASH = "0faa1a1d4d1c5ec6c2ac59a752269f7b53cb31aef53281237a036af54107f25499762fcd9a51926a6275964d35ce979cfce9a68b292db879ad40a8aca2415026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Paranoid \
python3.11dist-flask-paranoid \
python311-Flask-Paranoid \
python3dist-flask-paranoid"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
