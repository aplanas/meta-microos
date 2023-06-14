SUMMARY = "Python library for generating holidays on the fly"
DESCRIPTION = "A Python library for generating country, province and state specific sets of holidays on the fly. \
It makes determining whether a specific date is a holiday possible."
LICENSE = "MIT"

PV = "0.20"

RPM_NAME = "python310-holidays-0.20-1.2.noarch.rpm"
RPM_HASH = "5489d74a7f9576a9909602dda1a5d0cc061dc017825745bff11aeaaa1e470edb9fc77f807b6482fcebc953a9d44fb94aeea47b0201a8e3efa782435265927282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-holidays \
python3.10dist-holidays \
python310-holidays \
python3dist-holidays"

RDEPENDS:${PN} += "python-abi \
python310-convertdate \
python310-hijri-converter \
python310-korean-lunar-calendar \
python310-python-dateutil"

inherit rpm
