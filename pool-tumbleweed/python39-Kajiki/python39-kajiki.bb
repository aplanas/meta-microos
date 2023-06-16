SUMMARY = "Compiler for Genshi syntax outputting Python bytecode"
DESCRIPTION = "Kajiki compiles Genshi-like syntax to Python bytecode. \
 \
(Genshi is a Python library parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web.)"
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-Kajiki-0.9.2-1.2.aarch64.rpm"
RPM_HASH = "59d9d6037538f9049ae22366040bc294bb59b4bc3f14f9ba5e841f546ae1548d093673013a9cd4e26bdc0a0ecc2836a36a618fbb4afe829d907b2065861e5e52"

RPROVIDES:${PN} += "python3.9dist-kajiki \
python39-Kajiki \
python3dist-kajiki"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-linetable \
python39-nine \
update-alternatives"

inherit rpm
