SUMMARY = "ipdb/pdb statement checker plugin for flake8"
DESCRIPTION = "ipdb/pdb statement checker plugin for flake8"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python39-flake8-debugger-4.1.2-1.5.noarch.rpm"
RPM_HASH = "c157d94a66761cfa5ee47c32dfcc9dba10fc438a7244dcaa08ba6fe5ed25a79310587d09f9735a53f805947a146ed5627054a906ea5585632a435d8d508a9afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-debugger \
python39-flake8-debugger \
python3dist-flake8-debugger"

RDEPENDS:${PN} += "python-abi"

inherit rpm
