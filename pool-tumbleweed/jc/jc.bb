SUMMARY = "JSON CLI output utility"
DESCRIPTION = "jc is used to JSONify the output of many standard linux cli tools \
and file types for easier parsing in scripts."
LICENSE = "MIT"

PV = "1.22.4"

RPM_NAME = "jc-1.22.4-1.4.noarch.rpm"
RPM_HASH = "3f05c052f51101533c7e08160da168cf25ee62f2ede65ae604982f69be3bf8048ae400810f435d01f549360b036189c16140d50101b0bda816f254436b3a6f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jc \
python3.11dist-jc \
python3dist-jc"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pygments \
python3-ifconfig-parser \
python3-ruamel.yaml \
python3-xmltodict"

inherit rpm
