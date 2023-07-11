SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python311-patatt-0.6.3-1.3.noarch.rpm"
RPM_HASH = "9946084edac8764a411f9e8d7474c47d574022eaaa9aa6f78786ec1abc88bbf6a7b3a8627020cafcb0bc09d1261b6e242a5ef893588f8e715ddad7a38cdbc8c6"
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
