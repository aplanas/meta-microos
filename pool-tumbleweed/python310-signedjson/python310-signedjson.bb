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

RPM_NAME = "python310-signedjson-1.1.4-3.3.noarch.rpm"
RPM_HASH = "6a7f5ac72de4e0a5a4ec3fbde5f628da9ab82d13d2b161dc80688be635f9ed5dc7538a9667ca2b4f628d6ff24c968f3337e7fff75b5d5b0a57eda0c045e596a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-signedjson \
python310-signedjson \
python3dist-signedjson"

RDEPENDS:${PN} += "python-abi \
python310-PyNaCl \
python310-canonicaljson \
python310-importlib-metadata \
python310-typing-extensions \
python310-unpaddedbase64"

inherit rpm
