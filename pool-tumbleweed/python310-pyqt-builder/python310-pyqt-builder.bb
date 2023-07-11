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

RPM_NAME = "python310-pyqt-builder-1.15.1-2.3.noarch.rpm"
RPM_HASH = "392b25c56f554afd015f56ab406c3e2a6e3331ca67be5becd6e024f0288ead2bbce222d387be8dfcbd96535956b1a8fe4df92daa7c5e8d9ea87b6b5cc76cd08b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyqt-builder \
python310-PyQt-builder \
python310-pyqt-builder \
python3dist-pyqt-builder"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
python310-sip-devel \
update-alternatives"

inherit rpm
