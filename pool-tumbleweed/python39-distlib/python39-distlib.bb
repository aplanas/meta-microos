SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.6"

RPM_NAME = "python39-distlib-0.3.6-2.1.noarch.rpm"
RPM_HASH = "7c96dd73d913901c7bc84b7746b2fbe98983f4e49f3ce934b6b3f7d572c5ffb2c6631ca42c9178bcd882f8e3ea40aa9e80e77405e7cf266474e652b2ba213341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(distlib) \
python39-distlib \
python3dist(distlib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
