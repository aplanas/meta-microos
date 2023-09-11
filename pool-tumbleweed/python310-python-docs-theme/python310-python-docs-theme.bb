SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2023.7"

RPM_NAME = "python310-python-docs-theme-2023.7-1.1.noarch.rpm"
RPM_HASH = "0ce0181577705e656129fdbb2a455698a7ebcb439bc0b0a7c9cd22e32b313aac55255a37c34a9a9d3b287a09a43419aab6b1fd946bfb0ecb7eb8ccd4d6fc35c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-docs-theme \
python310-python-docs-theme \
python3dist-python-docs-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
