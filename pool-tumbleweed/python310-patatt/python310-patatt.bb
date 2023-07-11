SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python310-patatt-0.6.3-1.3.noarch.rpm"
RPM_HASH = "7634d626691b7cd8281122ac3787a59042fa412596dd111d79b12aa225c01a9d87b8718ba35bc2cd3019914eb1db83f43ad28d5202d212ee1f370adc04734b26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-patatt \
python310-patatt \
python3dist-patatt"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
