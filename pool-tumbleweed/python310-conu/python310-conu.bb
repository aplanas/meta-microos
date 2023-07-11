SUMMARY = "Python container testing library"
DESCRIPTION = "Python container testing library."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-conu-1.0.0-2.5.noarch.rpm"
RPM_HASH = "d33c35fd1ecca41c678e10813223d1ba47a22d2bb522ef149bcf05740e70a5343ce0c535dbedccf981b3d5b94f87a861544c4c46033480b24e5668698a49ad35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-conu \
python310-conu \
python3dist-conu"

RDEPENDS:${PN} += "python-abi \
python310-docker \
python310-flexmock \
python310-kubernetes \
python310-pytest \
python310-requests"

inherit rpm
