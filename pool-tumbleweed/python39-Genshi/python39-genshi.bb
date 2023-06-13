SUMMARY = "A toolkit for generation of output for the web"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid."
LICENSE = "BSD-3-Clause"

PV = "0.7.7"

RPM_NAME = "python39-Genshi-0.7.7-3.1.aarch64.rpm"
RPM_HASH = "59adb155ac6b4a2abc53f83bdb55b7dd7d49c7eed9f85df6c3832f067037641b4c04c2db901e60490fcd7e7842ff19d9daa6cbe387ad6cf944e907ebbd67ba82"

RPROVIDES:${PN} += "python3.9dist(genshi) \
python39-Genshi \
python39-Genshi(aarch-64) \
python3dist(genshi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-Babel \
python39-six \
python39-xml"

inherit rpm
