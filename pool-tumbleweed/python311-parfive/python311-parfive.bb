SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-parfive-1.3.0-1.12.noarch.rpm"
RPM_HASH = "2e6d319505362a3f166267e4965ab033fb8a080cf039aa6fa72d31a138d95c01010cdd8f9eb6005138af4b71700ebd404a01bb8b37cfed91dae64683becd4091"
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
