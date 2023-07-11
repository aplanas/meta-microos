SUMMARY = "Turns CSS blocks into style attributes"
DESCRIPTION = "Premailer is a Python library based on libxml which can analyze a \
HTML document and extract its CSS style sheets and then for all \
CSS seletors defined, it finds the DOM nodes and puts style \
attributes in instead."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python39-premailer-3.10.0-1.5.noarch.rpm"
RPM_HASH = "86719265f7f180a25050222113860ae851e3f0e4c94fa3b9ca2af55d5de794d6c2a103d38e86607e1bbb5c328c6c3bcb5e7900c65dfdcc4960aed7dc5844bfe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-premailer \
python39-premailer \
python3dist-premailer"

RDEPENDS:${PN} += "python-abi \
python39-cachetools \
python39-cssselect \
python39-cssutils \
python39-lxml \
python39-requests"

inherit rpm
