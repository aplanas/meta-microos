SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python39-patatt-0.6.3-2.1.noarch.rpm"
RPM_HASH = "17b5d4e308154270e310e24c3a6861619d04a3f7d2a428bada068bfe720c4ad3ecf35920d14780ad740cc97ac4348b24dd0907e4fd3b01256c3cc13c77da38eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-patatt \
python39-patatt \
python3dist-patatt"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
