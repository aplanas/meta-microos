SUMMARY = "Hosted coverage reports"
DESCRIPTION = "Hosted coverage reports for Github, Bitbucket and Gitlab."
LICENSE = "Apache-2.0"

PV = "2.1.13"

RPM_NAME = "python39-codecov-2.1.13-1.1.noarch.rpm"
RPM_HASH = "db81993bb7a0dcc3b08656b7f865729139bf5f3b34e9a3a164890efed8bd5b277ad48acc0eb9a76721a93041961345a70da07f015c5b5c29a92708c57558fc2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-codecov \
python39-codecov \
python3dist-codecov"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-coverage \
python39-requests \
update-alternatives"

inherit rpm
