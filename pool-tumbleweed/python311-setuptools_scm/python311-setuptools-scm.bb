SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python311-setuptools_scm-7.1.0-1.3.noarch.rpm"
RPM_HASH = "7811e37b44bc766205b40d6274837a6f08d51fbaa1ac58ced39465840f8ce2727a76559d55ca1a3d419644c85872784a38dad0bd7f2b5f38b95f74685822cdca"
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
