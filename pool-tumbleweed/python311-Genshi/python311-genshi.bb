SUMMARY = "A toolkit for generation of output for the web"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid."
LICENSE = "BSD-3-Clause"

PV = "0.7.7"

RPM_NAME = "python311-Genshi-0.7.7-3.1.aarch64.rpm"
RPM_HASH = "5ae3b3aab926c7be6c6541ad17febb196ce685f6309027ab3026355b497452e4bddc27c955888aeb187fa9076e330bc003de973fd6002242e397fd7a14ba1bbd"

RPROVIDES:${PN} += "python3.11dist(genshi) \
python311-Genshi \
python311-Genshi(aarch-64) \
python3dist(genshi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-Babel \
python311-six \
python311-xml"

inherit rpm
