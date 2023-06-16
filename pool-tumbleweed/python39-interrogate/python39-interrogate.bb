SUMMARY = "Interrogate a codebase for docstring coverage"
DESCRIPTION = "Interrogate a codebase for docstring coverage."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-interrogate-1.5.0-1.4.noarch.rpm"
RPM_HASH = "ba6a56a2857b72dcbb4fdb9a41f7477948f5dac88640f25781f2e8f91cb65f052f302ea901cb906250f50054cb4265fb3acb545c62ac534d3a7320096ca53953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-interrogate \
python39-interrogate \
python3dist-interrogate"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
python39-click \
python39-colorama \
python39-py \
python39-tabulate \
python39-toml \
update-alternatives"

inherit rpm
