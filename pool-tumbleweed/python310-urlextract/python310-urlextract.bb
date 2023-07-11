SUMMARY = "Collects and extracts URLs from given text"
DESCRIPTION = "Collects and extracts URLs from given text."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python310-urlextract-1.7.1-1.6.noarch.rpm"
RPM_HASH = "aa0c18c4affc5f82ae1dd966ba7c2b755f61a66e0686ef1b0ed95255e6d50cd133365b858667fdc0966e19bf8593a34e65a503d3ef0fb75328dcd5eaee5363fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-urlextract \
python310-urlextract \
python3dist-urlextract"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dnspython \
python310-filelock \
python310-idna \
python310-platformdirs \
python310-uritools \
update-alternatives"

inherit rpm
