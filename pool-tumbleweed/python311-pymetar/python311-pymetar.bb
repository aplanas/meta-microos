SUMMARY = "METAR weather report parser"
DESCRIPTION = "This library downloads the weather report for a given station ID, decodes \
it and provides easy access to all the data found in the report."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "python311-pymetar-1.1-2.13.noarch.rpm"
RPM_HASH = "3498363b357411f011b91a3df3e267a825c44d48c99d13d5d918823494c1b266f4935f521dc01c18bc442631c3d36bbd6a20e7aa7e7cd2c5f3256b9fc4b239f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pymetar) \
python311-pymetar \
python3dist(pymetar)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
