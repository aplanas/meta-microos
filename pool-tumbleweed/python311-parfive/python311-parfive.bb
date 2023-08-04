SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-parfive-2.0.2-1.1.noarch.rpm"
RPM_HASH = "9fc20ec297400bd5548ca0b005d945a9f0983030bf812aec1470dad8a6cef136944ec8abbc01d5037c32fe2fa3c2b3d8cc66548a4d8c598fa6c289ab5a939429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parfive \
python3.11dist-parfive \
python311-parfive \
python3dist-parfive"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiohttp \
python311-tqdm \
update-alternatives"

inherit rpm
