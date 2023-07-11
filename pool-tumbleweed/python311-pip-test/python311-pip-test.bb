SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python311-pip-test-23.1.2-2.3.noarch.rpm"
RPM_HASH = "171724edde433be183f12b386c2d74507957a71faafbfd870069a8125f067c327f45892958d5c0a797df819952f765352c741c432c2ccef58669f1b420df0065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-test \
python311-pip-test"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python311-setuptools \
python311-xml"

inherit rpm
