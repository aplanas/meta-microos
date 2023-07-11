SUMMARY = "A python wrapper for the Kismet database"
DESCRIPTION = "Kismet database wrapper."
LICENSE = "GPL-2.0-only"

PV = "2019.05.05"

RPM_NAME = "python39-kismetdb-2019.05.05-2.14.noarch.rpm"
RPM_HASH = "5219c53af677436af49969601642a37e61dc46ba962a5c39002006db657d33f1549a77527b1ae556eeed9bb9eeaa2ad9de0e64fdaa73975b54609fd483254e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kismetdb \
python39-kismetdb \
python3dist-kismetdb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-simplekml \
update-alternatives"

inherit rpm
