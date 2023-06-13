SUMMARY = "Git commit message linter checking"
DESCRIPTION = "Great for use as a commit-msg git hook or as part of your gating script in \
a CI/CD pipeline (e.g. jenkins). Many of the gitlint validations are based \
on well-known community standards, others are based on checks that we've \
found useful throughout the years. Gitlint has sane defaults, but you can \
also easily customize it to your own liking."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-gitlint-0.18.0-1.1.noarch.rpm"
RPM_HASH = "616c1b60f685b3769109afd79b31fd15e7c0e9d8b4bcf5bc5976531156c2bc2344caf0720e036bb99cb05a858d6985f3102708077d378155fbc66b010bf0f4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gitlint \
python3.10dist(gitlint-core) \
python310-gitlint \
python3dist(gitlint-core)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-arrow \
python310-click \
python310-sh \
update-alternatives"

inherit rpm
