SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python310-setuptools_scm-7.1.0-1.3.noarch.rpm"
RPM_HASH = "bcf3979ceb49e1768ee316876b840f588c27934491c45cd90c739a22698e321ca3262fa34b325f010b37c4d2475a6d9a81d3fca89010a53d345153e0c18e2dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools-scm \
python310-setuptools-scm \
python3dist-setuptools-scm"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-setuptools \
python310-tomli \
python310-typing-extensions"

inherit rpm
