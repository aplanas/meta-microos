SUMMARY = "Flask user session protection"
DESCRIPTION = "Flask-Paranoid is an extension for the Flask framework that protects the \
application against certain attacks in which the user session cookie is stolen \
and then used by the attacker. \
 \
The extension generates a 'paranoid' token according to the IP address and user \
agent when a client connects to the flask application."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-Flask-Paranoid-0.3.0-1.7.noarch.rpm"
RPM_HASH = "970e83d7a937f4473cbf3a8d5c72adf24ca25adfbcd05904723802f36e05e0272a67a358d110aeeb1772258b0a4545529d331b3f7c0fe2e3f4e2f891a9ab358a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-paranoid \
python39-Flask-Paranoid \
python3dist-flask-paranoid"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
