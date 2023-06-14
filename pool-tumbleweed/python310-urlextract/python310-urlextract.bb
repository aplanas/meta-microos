SUMMARY = "Collects and extracts URLs from given text"
DESCRIPTION = "Collects and extracts URLs from given text."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python310-urlextract-1.7.1-1.4.noarch.rpm"
RPM_HASH = "86d0dbb02b159ad551d1c858a897bd4f816057066ed834b0ea840078c66a069ba4608e5bf07d556fe47d4a39fd988c600d24c627f59ede326261129f38de339d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urlextract \
python3.10dist-urlextract \
python310-urlextract \
python3dist-urlextract"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-dnspython \
python310-filelock \
python310-idna \
python310-platformdirs \
python310-uritools \
update-alternatives"

inherit rpm
