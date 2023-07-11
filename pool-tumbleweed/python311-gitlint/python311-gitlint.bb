SUMMARY = "Git commit message linter checking"
DESCRIPTION = "Great for use as a commit-msg git hook or as part of your gating script in \
a CI/CD pipeline (e.g. jenkins). Many of the gitlint validations are based \
on well-known community standards, others are based on checks that we've \
found useful throughout the years. Gitlint has sane defaults, but you can \
also easily customize it to your own liking."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-gitlint-0.18.0-1.3.noarch.rpm"
RPM_HASH = "314bb5f9935d829341d18207b46ba9c36abe23a03ee2aa6f9bbe24ddf496cd1573b404be1e1b73403a83d8e9dcc53902f14d1283d44e30da03d85205f57f3c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gitlint \
python3.11dist-gitlint-core \
python311-gitlint \
python3dist-gitlint-core"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-arrow \
python311-click \
python311-sh \
update-alternatives"

inherit rpm
