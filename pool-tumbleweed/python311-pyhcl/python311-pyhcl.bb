SUMMARY = "HCL configuration parser for python"
DESCRIPTION = "HCL configuration parser for python"
LICENSE = "MPL-2.0"

PV = "0.4.4"

RPM_NAME = "python311-pyhcl-0.4.4-2.16.noarch.rpm"
RPM_HASH = "b8afa17610885b584a660980ce66bcc1411e1a0bb486dafe8935ee41c215730bafe6bdfda8501eea26748bf3f8068c42310a311c46de98dbebcea5cfcad2c407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyhcl \
python3.11dist-pyhcl \
python311-pyhcl \
python3dist-pyhcl"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
