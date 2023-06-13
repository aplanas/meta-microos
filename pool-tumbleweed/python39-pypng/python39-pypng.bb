SUMMARY = "Pure Python PNG image encoder/decoder"
DESCRIPTION = "PyPNG allows PNG image files to be read and written using pure Python."
LICENSE = "MIT"

PV = "0.0.20"

RPM_NAME = "python39-pypng-0.0.20-6.4.noarch.rpm"
RPM_HASH = "6feba3b682b057b2175715935c4f979888f3f6b40633e4979f9849b94a230e083f7aedad4a23081fc7eaa679ea549257e171a35e5a16680394c77d260b68d939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pypng) \
python39-pypng \
python3dist(pypng)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
