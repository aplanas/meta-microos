SUMMARY = "A tool for modernizing Python code using lib2to3"
DESCRIPTION = "A hack on top of fissix for modernizing Python code."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "0.8.0"

RPM_NAME = "python310-modernize-0.8.0-2.11.noarch.rpm"
RPM_HASH = "5339b3a3c1ac5b244cd292498dc7b571c9011cf07395fb1a53abb3245dafaa7f4b7463c0a760f7492baa23b80cfc922b9c71d77284b3ac214a4179244d3d68bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-modernize \
python310-modernize \
python3dist-modernize"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dbm \
python310-fissix \
update-alternatives"

inherit rpm
