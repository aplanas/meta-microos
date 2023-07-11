SUMMARY = "Jinja2 template renderer with yaml input files"
DESCRIPTION = "Jinja2 template renderer with yaml input files"
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-j2gen-0.1.0-3.11.noarch.rpm"
RPM_HASH = "15ea80f38f301c96ce6733c4e67a78e739c252c2cc7b7e293b11dd76ebf279da8d308c8e7876562c476bd9df1c59434e61fa899cbae960534708daa99143b5bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-j2gen \
python310-j2gen \
python3dist-j2gen"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-PyYAML \
update-alternatives"

inherit rpm
