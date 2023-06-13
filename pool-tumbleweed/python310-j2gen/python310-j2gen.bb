SUMMARY = "Jinja2 template renderer with yaml input files"
DESCRIPTION = "Jinja2 template renderer with yaml input files"
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-j2gen-0.1.0-3.9.noarch.rpm"
RPM_HASH = "e45506b4f9b4406a5df5f89acde4eb39d8cea128d09a468fa5489fbfa599f6e2ca8e07db9018dcbd1fee90d8bf394879d65e40b334c0811f4130c544c9106ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-j2gen \
python3.10dist(j2gen) \
python310-j2gen \
python3dist(j2gen)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Jinja2 \
python310-PyYAML \
update-alternatives"

inherit rpm
