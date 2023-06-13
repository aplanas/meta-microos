SUMMARY = "Python module to sign JSON with Ed25519 signatures"
DESCRIPTION = "Features: \
 \
* More than one entity can sign the same object. \
* Each entity can sign the object with more than one key making it easier to \
  rotate keys \
* ED25519 can be replaced with a different algorithm. \
* Unprotected data can be added to the object under the 'unsigned' key."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "python310-signedjson-1.1.4-2.2.noarch.rpm"
RPM_HASH = "eb37fffd7bdcd849e12db30356e1ea2c8564e8b6c4a4e2a4061cd293a14b0dc110f815223ef3ebb98e9f5ec2a2133f339d5e84f8a1ac0e8be4b94abe45be4646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-signedjson \
python3.10dist(signedjson) \
python310-signedjson \
python3dist(signedjson)"

RDEPENDS:${PN} += "python(abi) \
python310-PyNaCl \
python310-canonicaljson \
python310-importlib-metadata \
python310-typing_extensions \
python310-unpaddedbase64"

inherit rpm
