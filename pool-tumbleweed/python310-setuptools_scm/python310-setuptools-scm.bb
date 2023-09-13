SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python310-setuptools_scm-7.1.0-2.1.noarch.rpm"
RPM_HASH = "61fcd45e5b577174b52a2fe12102b8f4ccbdcf7e2614a3a9ad1007727cba551e34027f9cbd8c75f056a2bf9d68784ba0862d4cf0640b5ac51c843a3256619d53"
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
