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

RPM_NAME = "python39-pyqt-builder-1.15.1-2.3.noarch.rpm"
RPM_HASH = "da1e94ec016990baf73d4db75c51cd866d1beacaeeaf58eb80b5ef17d1d5d8c9534d6cd4921129500c846bc653946208e45cf86b317f24a296c11623d8548457"
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
