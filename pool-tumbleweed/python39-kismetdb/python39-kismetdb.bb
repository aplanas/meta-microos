SUMMARY = "A python wrapper for the Kismet database"
DESCRIPTION = "Kismet database wrapper."
LICENSE = "GPL-2.0-only"

PV = "2019.05.05"

RPM_NAME = "python39-kismetdb-2019.05.05-2.13.noarch.rpm"
RPM_HASH = "186a57cc0199c312b9b8a42faac3d30d0a05c3f421de0da88bd55adbef55edecbcf292f68fa6400a631ab94a9b158926ea9ba9872feccc6be4fcf3aea569fd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kismetdb \
python39-kismetdb \
python3dist-kismetdb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-python-dateutil \
python39-simplekml \
update-alternatives"

inherit rpm
