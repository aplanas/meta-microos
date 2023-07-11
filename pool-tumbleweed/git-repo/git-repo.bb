SUMMARY = "The Multiple Git Repository Tool"
DESCRIPTION = "Repo is a tool built on top of Git. Repo helps manage many Git repositories, does the uploads to \
revision control systems, and automates parts of the development  workflow. Repo is not meant to \
replace Git, only to make it easier to work with Git."
LICENSE = "Apache-2.0"

PV = "2.29"

RPM_NAME = "git-repo-2.29-1.1.noarch.rpm"
RPM_HASH = "25b91f4148bebd2d34a2649878d3c3ca101280d26e457f341efddffa705c55fab19389ab725b0787c2a19cd064c5127a92b1596662e410a9d9935f7b452c62ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-repo"

RDEPENDS:${PN} += "/usr/bin/python3 \
git \
python3-base"

inherit rpm
