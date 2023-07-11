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

RPM_NAME = "python311-signedjson-1.1.4-3.3.noarch.rpm"
RPM_HASH = "777d5fad6b03656ce5bd2f7ee8d1ad9ffc6020dae1356c154c37d3d3b4319141be878a2c770612e4a25a7bb731ec201204c29fb770f54532779014dfad713e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-signedjson \
python3.11dist-signedjson \
python311-signedjson \
python3dist-signedjson"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-canonicaljson \
python311-importlib-metadata \
python311-typing-extensions \
python311-unpaddedbase64"

inherit rpm
