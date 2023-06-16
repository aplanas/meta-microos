SUMMARY = "Tools to analyze security characteristics of MS Office and OLE files"
DESCRIPTION = "Python tools to analyze security characteristics of MS Office and OLE files (also called Structured Storage, Compound File Binary Format or Compound Document File Format), for Malware Analysis and Incident Response (DFIR)"
LICENSE = "BSD-2-Clause & MIT"

PV = "0.60"

RPM_NAME = "python39-oletools-0.60-3.10.noarch.rpm"
RPM_HASH = "63d418d3294a9e45041d0afd3a54d4ee25e0363f65a60270e770d6cc5728506a64c6c0c9c8ff0928689c64eae5b57c99c54f4c4b19b704e0b73c24335548b21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oletools \
python39-oletools \
python3dist-oletools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-colorclass \
python39-easygui \
python39-msoffcrypto-tool \
python39-olefile \
python39-pyparsing"

inherit rpm
