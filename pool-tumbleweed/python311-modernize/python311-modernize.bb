SUMMARY = "A tool for modernizing Python code using lib2to3"
DESCRIPTION = "A hack on top of fissix for modernizing Python code."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "0.8.0"

RPM_NAME = "python311-modernize-0.8.0-2.11.noarch.rpm"
RPM_HASH = "5798d143e0521357d8d2e7cb4bae959f8e9a76b6a5fcf9c5ad3f0115d1962e395eb49e6324a5a035e6b51284154dae4f0a0975eff6288fbb9ebcedf83f7a5910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-modernize \
python3.11dist-modernize \
python311-modernize \
python3dist-modernize"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dbm \
python311-fissix \
update-alternatives"

inherit rpm
