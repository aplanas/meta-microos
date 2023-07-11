SUMMARY = "Compiler for Genshi syntax outputting Python bytecode"
DESCRIPTION = "Kajiki compiles Genshi-like syntax to Python bytecode. \
 \
(Genshi is a Python library parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web.)"
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-Kajiki-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "082e7f8f220725fae564f913b70302fff84d5674c8a585c2d188f0ae89251e386f91ad4fc2b36dc66b2c85af07b6a2e3ac8c52c37ba8409bc5b2678bfad30d4d"

RPROVIDES:${PN} += "python3.10dist-kajiki \
python310-Kajiki \
python3dist-kajiki"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-linetable \
python310-nine \
update-alternatives"

inherit rpm
