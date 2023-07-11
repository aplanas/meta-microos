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

RPM_NAME = "python311-pyqt-builder-1.15.1-2.3.noarch.rpm"
RPM_HASH = "b13ffe9d662dec7f52bc1c9670e40cd3530d202cb2df8423f3a2969b749ed9299adf84e195fb17405e3803b1be8807e799ca25ea51dad187d02ae16c8260470b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt-builder \
python3-pyqt-builder \
python3.11dist-pyqt-builder \
python311-PyQt-builder \
python311-pyqt-builder \
python3dist-pyqt-builder"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
python311-sip-devel \
update-alternatives"

inherit rpm
