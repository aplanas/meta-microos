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

RPM_NAME = "python311-pyqt-builder-1.15.1-1.1.noarch.rpm"
RPM_HASH = "146804d9a1777695c5ff9a7b24a582189785e7040f0983a6085adbf4d9031aff61f1aaa54d31f6df6240f944ba525218d89fd0d2bf963f47289fe41a14b3ae90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyqt-builder) \
python311-PyQt-builder \
python311-pyqt-builder \
python3dist(pyqt-builder)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-packaging \
python311-sip-devel \
update-alternatives"

inherit rpm
