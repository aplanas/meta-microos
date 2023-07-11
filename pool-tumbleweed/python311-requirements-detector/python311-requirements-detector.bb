SUMMARY = "Python tool to find and list requirements of a Python project"
DESCRIPTION = "Requirements-detector is a Python tool which attempts to find and list \
the requirements of a Python project. \
 \
When run from the root of a Python project, it will try to ascertain \
which libraries and the versions of those libraries that the project \
depends on."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python311-requirements-detector-0.7-2.13.noarch.rpm"
RPM_HASH = "f2a9f75b441fff007ec78b1cff3571b2c44e364addcafe12bb35cdeeeacdfc40faba733d025bbb6bff503796704c99be7cb69d5adf0299651a1b431c4354ac50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requirements-detector \
python3.11dist-requirements-detector \
python311-requirements-detector \
python3dist-requirements-detector"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-astroid \
update-alternatives"

inherit rpm
