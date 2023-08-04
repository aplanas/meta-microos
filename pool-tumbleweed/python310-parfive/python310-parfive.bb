SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-parfive-2.0.2-1.1.noarch.rpm"
RPM_HASH = "18e0c4d525f5e3a8ea008456bdd4a4ac6ea015bfce5c0204e19ee290447a793c20380ced9c3bda3171b606b764194afd899346bd3a67b533a5aa9480681ff458"
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
