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

RPM_NAME = "python39-signedjson-1.1.4-3.3.noarch.rpm"
RPM_HASH = "95f9e64e67a5ed0080a13a0f0adddfe4cdec30880aeed7b8f821cb5ba7a2d134965caa68079624ad055629f16371706af00ea304e12318999223e9c9ac7fd718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-signedjson \
python39-signedjson \
python3dist-signedjson"

RDEPENDS:${PN} += "python-abi \
python39-PyNaCl \
python39-canonicaljson \
python39-importlib-metadata \
python39-typing-extensions \
python39-unpaddedbase64"

inherit rpm
