SUMMARY = "Tools to analyze security characteristics of MS Office and OLE files"
DESCRIPTION = "Python tools to analyze security characteristics of MS Office and OLE files (also called Structured Storage, Compound File Binary Format or Compound Document File Format), for Malware Analysis and Incident Response (DFIR)"
LICENSE = "BSD-2-Clause & MIT"

PV = "0.60"

RPM_NAME = "python311-oletools-0.60-3.10.noarch.rpm"
RPM_HASH = "c66d34f8e1aff21659444e15919db3f483a3283d4396b92656be112ef936ed076771226028b70003c1197049aea684710411fd5a75cc9f400acb97751c79f356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-oletools \
python311-oletools \
python3dist-oletools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-colorclass \
python311-easygui \
python311-msoffcrypto-tool \
python311-olefile \
python311-pyparsing"

inherit rpm
