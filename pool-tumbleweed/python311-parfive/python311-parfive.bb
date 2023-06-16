SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-parfive-1.3.0-1.10.noarch.rpm"
RPM_HASH = "920395abc4154571d9053450b8168156445821c8b75f79229c221b42656118d254fdd7aac7f146b871609ca22a272f31a361929b25fa5c587dde727f54606292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-parfive \
python311-parfive \
python3dist-parfive"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiohttp \
python311-tqdm \
update-alternatives"

inherit rpm
