SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python310-setuptools_scm-7.1.0-1.1.noarch.rpm"
RPM_HASH = "a16bd11cabc8810b462b614e19534aa9ceb4d2a7bbd8aef9e50e3938dce0486c5d9bb631d376cf5b8ac0c4cff5d5b836b3304a12490e7f22112e9fd6b0810e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools_scm \
python3.10dist(setuptools-scm) \
python310-setuptools_scm \
python3dist(setuptools-scm)"

RDEPENDS:${PN} += "python(abi) \
python310-packaging \
python310-setuptools \
python310-tomli \
python310-typing-extensions"

inherit rpm
