SUMMARY = "Read support for remote files for agate"
DESCRIPTION = "Agate-remote adds read support for remote files to agate."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-agate-remote-0.2.1-1.5.noarch.rpm"
RPM_HASH = "fca78222837909af633c92b3cb1bc51273a13f10a7bfc97916d67d12b27fe66cfbf8f752d786cfab1195673e693c883a87e42713b2cb1d8b1808ec946e55b96c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-agate-remote \
python39-agate-remote \
python3dist-agate-remote"

RDEPENDS:${PN} += "python-abi \
python39-agate \
python39-requests"

inherit rpm
