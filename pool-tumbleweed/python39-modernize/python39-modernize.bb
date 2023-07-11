SUMMARY = "A tool for modernizing Python code using lib2to3"
DESCRIPTION = "A hack on top of fissix for modernizing Python code."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "0.8.0"

RPM_NAME = "python39-modernize-0.8.0-2.11.noarch.rpm"
RPM_HASH = "449e4c52aa5dd1e91159b96d2757afd80d43bb732de23dc1152de6e1e7ae08167c0353d2ff75b77a60966463224ff8324d34a9c5bd673dda9a5b4d049f0f475c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-modernize \
python39-modernize \
python3dist-modernize"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dbm \
python39-fissix \
update-alternatives"

inherit rpm
