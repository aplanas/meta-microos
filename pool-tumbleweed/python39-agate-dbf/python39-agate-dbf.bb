SUMMARY = "Read support for dbf files for agate"
DESCRIPTION = "Agate-dbf adds read support for dbf files to agate."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-agate-dbf-0.2.2-1.12.noarch.rpm"
RPM_HASH = "9f63b6601b92118624516f7409641922ad31250008e8ea69f7e3da3ed0b13a7b19dc7c5de5b09476c2f0ca5e7e3fb8e7910163d53fd226b1e94b094662078d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-agate-dbf \
python39-agate-dbf \
python3dist-agate-dbf"

RDEPENDS:${PN} += "python-abi \
python39-agate \
python39-dbfread"

inherit rpm
