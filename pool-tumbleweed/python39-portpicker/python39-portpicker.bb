SUMMARY = "A library to choose unique available network ports"
DESCRIPTION = "Portpicker provides an API to find and return an available network port for \
an application to bind to. Ideally suited for use from unittests or for test \
harnesses that launch local servers."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python39-portpicker-1.5.2-1.6.noarch.rpm"
RPM_HASH = "223f4299917f46156b34a9f5145a17c07caea2ee1f1d5011c529abebcc96a0a3d5cfb247c42a024cc9dc65bd69bc77b48b0b0d1e9d8c715e81fa5e8d7df6a1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-portpicker \
python39-portpicker \
python3dist-portpicker"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
