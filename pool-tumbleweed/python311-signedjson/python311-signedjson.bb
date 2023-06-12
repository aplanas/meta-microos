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

RPM_NAME = "python311-signedjson-1.1.4-2.2.noarch.rpm"
RPM_HASH = "1839be250b8033648a357b24dbb03260473bb5247726b70bafe36620c1cb68521a7a1e7b18968c50dc9b38491385e522a24ee0e2391aca7545e8f009d278f51c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(signedjson) \
python311-signedjson \
python3dist(signedjson)"
RDEPENDS:${PN} += "python(abi) \
python311-PyNaCl \
python311-canonicaljson \
python311-importlib-metadata \
python311-typing_extensions \
python311-unpaddedbase64"

inherit rpm
