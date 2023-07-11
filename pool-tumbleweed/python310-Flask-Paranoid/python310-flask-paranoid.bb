SUMMARY = "Flask user session protection"
DESCRIPTION = "Flask-Paranoid is an extension for the Flask framework that protects the \
application against certain attacks in which the user session cookie is stolen \
and then used by the attacker. \
 \
The extension generates a 'paranoid' token according to the IP address and user \
agent when a client connects to the flask application."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-Flask-Paranoid-0.3.0-1.7.noarch.rpm"
RPM_HASH = "3e05d4978e94d2df7d3319c45bc19ace6a57cf3dd18cc3805b2362189095775988b340cae6b8995028e3882e61f073d451bbaf5d3d0b72027023e3841ed23fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-paranoid \
python310-Flask-Paranoid \
python3dist-flask-paranoid"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm
