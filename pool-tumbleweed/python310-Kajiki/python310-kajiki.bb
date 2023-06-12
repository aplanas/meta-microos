SUMMARY = "Compiler for Genshi syntax outputting Python bytecode"
DESCRIPTION = "Kajiki compiles Genshi-like syntax to Python bytecode. \
 \
(Genshi is a Python library parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web.)"
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-Kajiki-0.9.2-1.2.aarch64.rpm"
RPM_HASH = "e23eb106e0d01ea453cbff8689d4a4137f6f298cd4f7e4d6ad058f43a36e81c4e54878ebf1e790ae738d9517398f4a5cb45b73f278c328a7c4d76dc7f5353faf"

RPROVIDES:${PN} += "python3-Kajiki \
python3.10dist(kajiki) \
python310-Kajiki \
python310-Kajiki(aarch-64) \
python3dist(kajiki)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-linetable \
python310-nine \
update-alternatives"

inherit rpm
