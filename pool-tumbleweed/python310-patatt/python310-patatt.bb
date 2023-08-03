SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python310-patatt-0.6.3-2.1.noarch.rpm"
RPM_HASH = "ba6aeac8d85ee13e652885d29518a46af70346a63aff732cb3d820c5e8c11bb417da1623860ab54b0b58a89b8021ac6368321e15c7ffa02eaa2ff02476362876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-patatt \
python310-patatt \
python3dist-patatt"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
