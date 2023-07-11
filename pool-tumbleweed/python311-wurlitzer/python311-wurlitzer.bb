SUMMARY = "Python package to capture C-level output in context managers"
DESCRIPTION = "Wurlitzer is a python package to capture C-level \
output in context managers."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python311-wurlitzer-3.0.3-1.5.noarch.rpm"
RPM_HASH = "d1ee44fcdb28af52c8b337a56bfd3df597af8e801919497af9132716171f336c424f581dc597cc16e0e2f99ae898400c3d7c5ba0713d67f0439b232004bb443f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wurlitzer \
python3.11dist-wurlitzer \
python311-wurlitzer \
python3dist-wurlitzer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
