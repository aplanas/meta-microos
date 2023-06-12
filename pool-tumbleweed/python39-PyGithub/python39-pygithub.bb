SUMMARY = "Python library to use the GitHub API v3"
DESCRIPTION = "PyGithub is a Python 3 library to use the Github API v3. \
Github resources (repositories, user profiles, organizations, \
etc.) can be managed with this."
LICENSE = "LGPL-3.0-or-later"

PV = "1.57"

RPM_NAME = "python39-PyGithub-1.57-1.3.noarch.rpm"
RPM_HASH = "77c789fdfd0347b2624065e4c1d7c97a65aed510414ba52dad6821c13024f6cdc8b06f1719118b7550c7712329ff76f0838fc1945862b31c2873808675f01e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pygithub) \
python39-PyGithub \
python3dist(pygithub)"
RDEPENDS:${PN} += "python(abi) \
python39-Deprecated \
python39-PyJWT \
python39-PyNaCl \
python39-requests"

inherit rpm
