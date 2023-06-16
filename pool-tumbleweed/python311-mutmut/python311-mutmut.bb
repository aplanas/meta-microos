SUMMARY = "Python mutation testing"
DESCRIPTION = "Python mutation testing."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python311-mutmut-2.0.0-4.7.noarch.rpm"
RPM_HASH = "e25975ba3f29a45a43675c317127b06a307cfd41c9f363c38d4ddf954a359934b4cc4a127948746e8853bbdcbf23e1f96512b817292959214ece0f779004ce5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mutmut \
python311-mutmut \
python3dist-mutmut"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-glob2 \
python311-hammett \
python311-junit-xml \
python311-parso \
python311-pony \
python311-setuptools \
python311-tri.declarative \
update-alternatives"

inherit rpm
