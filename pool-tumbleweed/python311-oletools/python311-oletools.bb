SUMMARY = "Tools to analyze security characteristics of MS Office and OLE files"
DESCRIPTION = "Python tools to analyze security characteristics of MS Office and OLE files (also called Structured Storage, Compound File Binary Format or Compound Document File Format), for Malware Analysis and Incident Response (DFIR)"
LICENSE = "BSD-2-Clause & MIT"

PV = "0.60"

RPM_NAME = "python311-oletools-0.60-3.12.noarch.rpm"
RPM_HASH = "190ee9df91d6897947b0efa2835a5c8c6f2edfcb5708758799e6ac7e971191ba084fb761a6bc1cd698925f7315f731ad66389d3a3aba47a2d839910e0cbefe90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oletools \
python3.11dist-oletools \
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
