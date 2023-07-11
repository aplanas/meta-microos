SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-parfive-1.3.0-1.12.noarch.rpm"
RPM_HASH = "34e63a92d6cbb96cbab8526b6342ade2d01f0ee03daaca99f33f439479deb074e5d4df88c66bbdddaff8524dba7e25e86dac3e8853c7c5d2a582a46cc724e8b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parfive \
python39-parfive \
python3dist-parfive"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-aiohttp \
python39-tqdm \
update-alternatives"

inherit rpm
