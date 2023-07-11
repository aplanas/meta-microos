SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python39-patatt-0.6.3-1.3.noarch.rpm"
RPM_HASH = "fe8016dd0fbeb1318358c82c875de43b1e17e52d907108d00e7eef5b519b7fe4f4da770cf486fd50b6cfcdd4d10a3e9971dd03c7bf006bb25f5329055a2a89a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-patatt \
python39-patatt \
python3dist-patatt"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
