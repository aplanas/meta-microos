SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-parfive-2.0.2-1.1.noarch.rpm"
RPM_HASH = "ad7a266356ec924b7345dfbdcdebf1d27c57df3044bc5307ac0c35fb5f2206d8d45218c44b800dc65c067985f33be644ee5f14756bf9833ceb7aef315e2dfe97"
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
