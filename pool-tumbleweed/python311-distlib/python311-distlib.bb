SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.6"

RPM_NAME = "python311-distlib-0.3.6-2.1.noarch.rpm"
RPM_HASH = "52e104f4215511222f4e16338a57d3be15cb5e52fcd88e44f7063e4eead1bd99a4a4c3724ddb1aab38e67ffc9ff49846bd38cfdbae1c4230956a4dd00b7aa342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(distlib) \
python311-distlib \
python3dist(distlib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
