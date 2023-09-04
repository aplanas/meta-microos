SUMMARY = "Sphinx 'youtube' extension"
DESCRIPTION = "Sphinx 'youtube' extension"
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python39-sphinxcontrib-youtube-1.2.0-1.1.noarch.rpm"
RPM_HASH = "2e82cdb7bb54ade2846331f3f440cca46aeea614eb29f300dbddae48ff67745d4ec16e162e81f3741fa2d12d02d982ba3fe59a025188c9fe47d8bfa817b110e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-youtube \
python39-sphinxcontrib-youtube \
python3dist-sphinxcontrib-youtube"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-requests"

inherit rpm
