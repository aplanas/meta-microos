SUMMARY = "Collects and extracts URLs from given text"
DESCRIPTION = "Collects and extracts URLs from given text."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python39-urlextract-1.7.1-1.6.noarch.rpm"
RPM_HASH = "921ae5a038a2aac941fec0ac9c673225813864a27b92dbf57e04704dc837a585d831a2fb11779e311975f503a6a26df09c9a1e3bb3b14c0497030857084d6da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-urlextract \
python39-urlextract \
python3dist-urlextract"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dnspython \
python39-filelock \
python39-idna \
python39-platformdirs \
python39-uritools \
update-alternatives"

inherit rpm
