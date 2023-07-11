SUMMARY = "Compiler for Genshi syntax outputting Python bytecode"
DESCRIPTION = "Kajiki compiles Genshi-like syntax to Python bytecode. \
 \
(Genshi is a Python library parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web.)"
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-Kajiki-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "caa1238e3dcbff77e525d0d9438b2c02410a5ab5b3170cb24a3c6b6a7b895b04e8a6ce7fc3307c2d5d3d07c6ec85d2f6aae414a12d1df8931227b589a93ba1f5"

RPROVIDES:${PN} += "python3-Kajiki \
python3.11dist-kajiki \
python311-Kajiki \
python3dist-kajiki"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-linetable \
python311-nine \
update-alternatives"

inherit rpm
