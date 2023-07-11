SUMMARY = "Documentation for python-pyserial"
DESCRIPTION = "Documentation, examples, and help files for python-pyserial."
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python-pyserial-doc-3.5-3.2.noarch.rpm"
RPM_HASH = "f378ebf6f591c9d83f26d1aff9c06d7017226a98aa3b5bce8e7e3ae379d4704e6212cf5516907b43eacc9a5c8c42f5e3fdb421b2611357cf8da21712dcf4acee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyserial-doc \
python2-pyserial-doc \
python3-pyserial-doc"

RDEPENDS:${PN} += ""

inherit rpm
