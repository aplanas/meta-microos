SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python311-patatt-0.6.3-1.1.noarch.rpm"
RPM_HASH = "b59c261dca5573313c5b404c21cc55451f0e5dcac05aaf828ae64b43171e21ec42812b1eb362e5d1e57b8903cda4462a6608061443c9742f6efe648d6078bac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-patatt \
python311-patatt \
python3dist-patatt"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
