SUMMARY = "The Multiple Git Repository Tool"
DESCRIPTION = "Repo is a tool built on top of Git. Repo helps manage many Git repositories, does the uploads to \
revision control systems, and automates parts of the development  workflow. Repo is not meant to \
replace Git, only to make it easier to work with Git."
LICENSE = "Apache-2.0"

PV = "2.21"

RPM_NAME = "git-repo-2.21-1.5.noarch.rpm"
RPM_HASH = "2717aa6d12feff61f029c1b6e4cd3bf199fdcf1b906dc083826b50981458c99907e2f43c3a0cd831cd441c77f48859a6377217a295935f10147970ef0c0846f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-repo"
RDEPENDS:${PN} += "/usr/bin/python3 \
git \
python3-base"

inherit rpm
