SUMMARY = "Convert various requirements-type files to use with pip-tools"
DESCRIPTION = "A simple wrapper around pip to support requirements.txt, Pipenv and Poetry files for containerized applications"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.5"

RPM_NAME = "python39-micropipenv-1.4.5-1.6.noarch.rpm"
RPM_HASH = "f8c5b1bf710a79e23878a93de115dc93cff208d1e000155d58b961fe69598d1c79d484f5af7a9cc6a4f6790eed3c6f4b20df6465d9aafc5a3f11438d3fc5c7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-micropipenv \
python39-micropipenv \
python3dist-micropipenv"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pip \
update-alternatives"

inherit rpm
