SUMMARY = "Email bounce detectors"
DESCRIPTION = "Email bounce detectors."
LICENSE = "Apache-2.0"

PV = "4.0"

RPM_NAME = "python39-flufl.bounce-4.0-4.3.noarch.rpm"
RPM_HASH = "39c4c42b8a7314d25078935837b872255da4df365550a2cbf0ab049680f37dd2a981886ca223abb1170d01d2dedb63a9e1746a60e0c996470865eeae80ad24bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flufl.bounce \
python39-flufl.bounce \
python3dist-flufl.bounce"

RDEPENDS:${PN} += "python-abi \
python39-atpublic \
python39-zope.interface"

inherit rpm
