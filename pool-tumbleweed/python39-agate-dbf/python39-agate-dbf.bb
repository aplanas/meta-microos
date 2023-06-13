SUMMARY = "Read support for dbf files for agate"
DESCRIPTION = "Agate-dbf adds read support for dbf files to agate."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-agate-dbf-0.2.2-1.10.noarch.rpm"
RPM_HASH = "9f95627c2a2f63ac354c67943140dbd677e8d3cb909e59e7ded289409d26ba5ef9bceb831b1d58418bf85605b14371568cd587d4b8627c9c04baace634640916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(agate-dbf) \
python39-agate-dbf \
python3dist(agate-dbf)"

RDEPENDS:${PN} += "python(abi) \
python39-agate \
python39-dbfread"

inherit rpm
