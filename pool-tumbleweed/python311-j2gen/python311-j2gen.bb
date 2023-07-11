SUMMARY = "Jinja2 template renderer with yaml input files"
DESCRIPTION = "Jinja2 template renderer with yaml input files"
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-j2gen-0.1.0-3.11.noarch.rpm"
RPM_HASH = "729b40b1d2a5406eec73871a4d36367e5573f9750d7d81e5c9adf01ca1e542493d5bc22b7c06a616f0d7bb2426ac7c19bb43a6835b673432d8cad030f2b9d9b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-j2gen \
python3.11dist-j2gen \
python311-j2gen \
python3dist-j2gen"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-PyYAML \
update-alternatives"

inherit rpm
