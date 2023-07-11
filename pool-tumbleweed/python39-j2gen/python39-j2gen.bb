SUMMARY = "Jinja2 template renderer with yaml input files"
DESCRIPTION = "Jinja2 template renderer with yaml input files"
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-j2gen-0.1.0-3.11.noarch.rpm"
RPM_HASH = "92b1239eb8befa756559be6afb37013c5232003eb2b021d773f31c09efe477712ce3868498384beed9d128561555a3b011bf3cadbaf11586a3fc04d33d03b818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-j2gen \
python39-j2gen \
python3dist-j2gen"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-PyYAML \
update-alternatives"

inherit rpm
