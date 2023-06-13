SUMMARY = "Additional EBCDIC codecs for Python"
DESCRIPTION = "Additional EBCDIC codecs for Python."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python39-ebcdic-1.1.1-2.9.noarch.rpm"
RPM_HASH = "9a61176096f2fa5dbf1c0e56706eeb14c444abb603f4095ee2a2d0cd14a9c5ab4380f3d60009ae3fcdba5f5ae8c2446c46f4e7528d1652b506caa23dd1da1ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ebcdic) \
python39-ebcdic \
python3dist(ebcdic)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
