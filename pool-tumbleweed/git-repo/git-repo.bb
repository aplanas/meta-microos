SUMMARY = "The Multiple Git Repository Tool"
DESCRIPTION = "Repo is a tool built on top of Git. Repo helps manage many Git repositories, does the uploads to \
revision control systems, and automates parts of the development  workflow. Repo is not meant to \
replace Git, only to make it easier to work with Git."
LICENSE = "Apache-2.0"

PV = "2.35"

RPM_NAME = "git-repo-2.35-1.1.noarch.rpm"
RPM_HASH = "a0b435c1446d386e9f1716f65ebd245f73ba859669bc4c57efc7b9b1890a89d33a6fe071fdf9d3f073700112a6517600e231e4d3ca79bb5745dbc99d2c009bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-repo"

RDEPENDS:${PN} += "/usr/bin/python3 \
git \
python3-base"

inherit rpm
