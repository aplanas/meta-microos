SUMMARY = "Tools to analyze security characteristics of MS Office and OLE files"
DESCRIPTION = "Python tools to analyze security characteristics of MS Office and OLE files (also called Structured Storage, Compound File Binary Format or Compound Document File Format), for Malware Analysis and Incident Response (DFIR)"
LICENSE = "BSD-2-Clause & MIT"

PV = "0.60"

RPM_NAME = "python310-oletools-0.60-3.10.noarch.rpm"
RPM_HASH = "08be8fcc4ce0a88a835a5d2b99b6d49ec3485c34b9528b37662aaa5d9efd0ff3bc05d467d7f33cb33407198dd2fba1d9bbd68ecbba2583f38f92631b0c9117d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oletools \
python3.10dist(oletools) \
python310-oletools \
python3dist(oletools)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-colorclass \
python310-easygui \
python310-msoffcrypto-tool \
python310-olefile \
python310-pyparsing"

inherit rpm
