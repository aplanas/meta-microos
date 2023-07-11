SUMMARY = "Tools to analyze security characteristics of MS Office and OLE files"
DESCRIPTION = "Python tools to analyze security characteristics of MS Office and OLE files (also called Structured Storage, Compound File Binary Format or Compound Document File Format), for Malware Analysis and Incident Response (DFIR)"
LICENSE = "BSD-2-Clause & MIT"

PV = "0.60"

RPM_NAME = "python39-oletools-0.60-3.12.noarch.rpm"
RPM_HASH = "e0538e7859b1c4719071043469ef58ebf50c0403b940313af07a7c73bf94eadd76a38e645f08ac4522df23f66ccd3ed8933dc7547d92e1302e4a7e428762fe60"
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
