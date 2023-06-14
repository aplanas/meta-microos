SUMMARY = "Flask user session protection"
DESCRIPTION = "Flask-Paranoid is an extension for the Flask framework that protects the \
application against certain attacks in which the user session cookie is stolen \
and then used by the attacker. \
 \
The extension generates a 'paranoid' token according to the IP address and user \
agent when a client connects to the flask application."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-Flask-Paranoid-0.3.0-1.5.noarch.rpm"
RPM_HASH = "0daa4252813f6becf4af37511ea23418a8e0089b7ebf4bcf68ef283ffe95a9dd6fc323a694ad39dbf881784d329c1bae9e96893972ac7bd62f0b9bd5dc31c5cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-paranoid \
python39-Flask-Paranoid \
python3dist-flask-paranoid"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
