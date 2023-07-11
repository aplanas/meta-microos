SUMMARY = "Generate RSS2 using a Python data structure"
DESCRIPTION = "A Python library for generating RSS 2.0 feeds."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python310-PyRSS2Gen-1.1-2.15.noarch.rpm"
RPM_HASH = "ace99ed8123fdf09ddef5fc6dcaeba57baf39aa7f278309af0625f13d0c61a6f37979e0f2cf70bd47ab07eb793dba48826474e9a412bf58318aae801af5b860d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyrss2gen \
python3.10dist-pyrss2gen \
python310-PyRSS2Gen \
python3dist-pyrss2gen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
