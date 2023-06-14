SUMMARY = "Turns CSS blocks into style attributes"
DESCRIPTION = "Premailer is a Python library based on libxml which can analyze a \
HTML document and extract its CSS style sheets and then for all \
CSS seletors defined, it finds the DOM nodes and puts style \
attributes in instead."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python310-premailer-3.10.0-1.3.noarch.rpm"
RPM_HASH = "b34f10b9922541ade526cf9065e6214c1f9de87bfccfe3eddd43bcf4ceee37f1eee08c0134d711a4486c2178039135f70b3b47b91e875714bcbdbf3f03a51d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-premailer \
python3.10dist-premailer \
python310-premailer \
python3dist-premailer"

RDEPENDS:${PN} += "python-abi \
python310-cachetools \
python310-cssselect \
python310-cssutils \
python310-lxml \
python310-requests"

inherit rpm
