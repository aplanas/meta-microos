SUMMARY = "The PEP 517 compliant PyQt build system"
DESCRIPTION = "PyQt-builder is the PEP 517 compliant build system for PyQt and projects that \
extend PyQt. It extends the sip build system and uses Qt’s qmake to perform the \
actual compilation and installation of extension modules. \
 \
Projects that use PyQt-builder provide an appropriate pyproject.toml file and an \
optional project.py script. Any PEP 517 compliant frontend, for example \
sip-install or pip can then be used to build and install the project."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "1.15.1"

RPM_NAME = "python39-pyqt-builder-1.15.1-1.1.noarch.rpm"
RPM_HASH = "30d56871274ab67c5990d50ba82d01da420f97d7bd5be1c2930832557d536eefdf60b59c57b16f12a5162875854141eaa316a46fca0558e120fedb40cbde3530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyqt-builder \
python39-PyQt-builder \
python39-pyqt-builder \
python3dist-pyqt-builder"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
python39-sip-devel \
update-alternatives"

inherit rpm
