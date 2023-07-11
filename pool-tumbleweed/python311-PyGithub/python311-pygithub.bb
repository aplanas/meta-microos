SUMMARY = "Python library to use the GitHub API v3"
DESCRIPTION = "PyGithub is a Python 3 library to use the Github API v3. \
Github resources (repositories, user profiles, organizations, \
etc.) can be managed with this."
LICENSE = "LGPL-3.0-or-later"

PV = "1.57"

RPM_NAME = "python311-PyGithub-1.57-1.5.noarch.rpm"
RPM_HASH = "0e20daff730b24c5651f3a0c42ff27c3d90a47d0cee717dcbfdd35345b1cfb5073dc4e3960cf3621f78f1f02cea19eb8557b7aa7ad1fc1318594b3381470691e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyGithub \
python3.11dist-pygithub \
python311-PyGithub \
python3dist-pygithub"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-PyJWT \
python311-PyNaCl \
python311-requests"

inherit rpm
