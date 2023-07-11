SUMMARY = "Tools to analyze security characteristics of MS Office and OLE files"
DESCRIPTION = "Python tools to analyze security characteristics of MS Office and OLE files (also called Structured Storage, Compound File Binary Format or Compound Document File Format), for Malware Analysis and Incident Response (DFIR)"
LICENSE = "BSD-2-Clause & MIT"

PV = "0.60"

RPM_NAME = "python310-oletools-0.60-3.12.noarch.rpm"
RPM_HASH = "5732a6efd3bbb76123ce39164d26730bee692286306c1fe75f99ebcad036ca91f63f68577884e79438ed28bf7974495ac76f8c512229441f378df1626de80a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oletools \
python310-oletools \
python3dist-oletools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-colorclass \
python310-easygui \
python310-msoffcrypto-tool \
python310-olefile \
python310-pyparsing"

inherit rpm
