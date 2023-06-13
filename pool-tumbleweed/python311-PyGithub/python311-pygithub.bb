SUMMARY = "Python library to use the GitHub API v3"
DESCRIPTION = "PyGithub is a Python 3 library to use the Github API v3. \
Github resources (repositories, user profiles, organizations, \
etc.) can be managed with this."
LICENSE = "LGPL-3.0-or-later"

PV = "1.57"

RPM_NAME = "python311-PyGithub-1.57-1.3.noarch.rpm"
RPM_HASH = "e8c9d40e199dffc7af1fce08e3c2499eb4e3d102efaf717d00c105c3f1493470f3c5ad14414e6b2ff1f4e711fb89ab758dc4a469c4f2b8c23365f3f44fc31860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pygithub) \
python311-PyGithub \
python3dist(pygithub)"

RDEPENDS:${PN} += "python(abi) \
python311-Deprecated \
python311-PyJWT \
python311-PyNaCl \
python311-requests"

inherit rpm
