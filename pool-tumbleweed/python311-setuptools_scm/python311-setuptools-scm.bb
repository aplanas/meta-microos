SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python311-setuptools_scm-7.1.0-2.1.noarch.rpm"
RPM_HASH = "6c978a78276ffe4978a4500d490800bad4a0d4ed5c2557a8ea885c151df83e4635cc418394bc6e8b7a3cd9c2dde66dc30ae9cee212b19320bbd3c29f7d415772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-scm \
python3.11dist-setuptools-scm \
python311-setuptools-scm \
python3dist-setuptools-scm"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-setuptools \
python311-typing-extensions"

inherit rpm
