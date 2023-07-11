SUMMARY = "Devel files for python311-PyQt6-DataVisualization"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-DataVisualization"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-DataVisualization-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "f9649cd52fff408829bc9e899e5333a3f81b052203cd6f49f502570deb3cb29d86c4ee02e1b565d7ddf66d9caa895cd9cce6442c967082c4047aaff48d624c89"

RPROVIDES:${PN} += "python3-PyQt6-DataVisualization-devel \
python311-PyQt6-DataVisualization-devel"

RDEPENDS:${PN} += "python-abi \
python311-PyQt6-devel"

inherit rpm
