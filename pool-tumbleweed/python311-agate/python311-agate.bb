SUMMARY = "Data analysis library optimized for humans instead of machines"
DESCRIPTION = "Agate is a Python data analysis library that is optimized for humans \
instead of machines. It is an alternative to numpy and pandas that \
solves real-world problems with readable code. \
 \
Agate was previously known as journalism."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python311-agate-1.7.1-2.4.noarch.rpm"
RPM_HASH = "231a057631de00f46031a79234e1821707e6409c0afc633c77f96c38298d0358c0f451dc177b20fe5dbdd9660d15fa45838ad62db1f91d6aca7d33f20a6c27d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate \
python3.11dist-agate \
python311-agate \
python3dist-agate"

RDEPENDS:${PN} += "python-abi \
python311-Babel \
python311-isodate \
python311-leather \
python311-parsedatetime \
python311-python-slugify \
python311-pytimeparse"

inherit rpm
