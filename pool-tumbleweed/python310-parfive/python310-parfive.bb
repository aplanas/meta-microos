SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-parfive-1.3.0-1.12.noarch.rpm"
RPM_HASH = "b8bee2017b3f213c7901bd585ce2cdb79af2ec176f5032c691099b93bb834b9e9bbe4255cc0c5067195c00688df38c44ab70458e722e2734593d4886dee20c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parfive \
python310-parfive \
python3dist-parfive"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-aiohttp \
python310-tqdm \
update-alternatives"

inherit rpm
