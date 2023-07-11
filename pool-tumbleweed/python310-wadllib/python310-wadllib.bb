SUMMARY = "Navigate HTTP resources using WADL files as guides"
DESCRIPTION = "An Application object represents a web service described by a WADL \
file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python310-wadllib-1.3.6-1.10.noarch.rpm"
RPM_HASH = "6eaca4a03e487989363bd2b130a612cac69ff9484716d4a06992d75cc48f17b43b1800e817d7d320cd3be86598579668ab7c4afa8782f9aafebd9824e46b161d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wadllib \
python310-wadllib \
python3dist-wadllib"

RDEPENDS:${PN} += "python-abi \
python310-lazr.uri"

inherit rpm
