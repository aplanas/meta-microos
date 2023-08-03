SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python311-patatt-0.6.3-2.1.noarch.rpm"
RPM_HASH = "c352ca2ad6880afc145585522071f1855b1d43a88616782c2ac8fb7f9250927ef72533ad02b6b378f0319a98ad47a02e166ed5817f6cc421c6823a23e0e41299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patatt \
python3.11dist-patatt \
python311-patatt \
python3dist-patatt"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
