SUMMARY = "Compiler for Genshi syntax outputting Python bytecode"
DESCRIPTION = "Kajiki compiles Genshi-like syntax to Python bytecode. \
 \
(Genshi is a Python library parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web.)"
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-Kajiki-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "ac527c5220abeeaef21bc3bdee03c60f899850c56801fa987b420ab91069bcab3b9c60d5fd0d372f491cbf6ff9a9a1f5d86bcf8ad1553218f24ec21c8f40d80d"

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
