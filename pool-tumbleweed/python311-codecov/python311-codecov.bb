SUMMARY = "Hosted coverage reports"
DESCRIPTION = "Hosted coverage reports for Github, Bitbucket and Gitlab."
LICENSE = "Apache-2.0"

PV = "2.1.13"

RPM_NAME = "python311-codecov-2.1.13-1.3.noarch.rpm"
RPM_HASH = "329d2239d9b145e32599d2c81f25cb48072a1378f2e4866bda93fb5a22825daeeb601522b8d375e106f5ea7fc4150894c055e44f93f45404f6e0427223186f94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-codecov \
python3.11dist-codecov \
python311-codecov \
python3dist-codecov"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-coverage \
python311-requests \
update-alternatives"

inherit rpm
