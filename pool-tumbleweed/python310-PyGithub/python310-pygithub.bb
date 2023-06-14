SUMMARY = "Python library to use the GitHub API v3"
DESCRIPTION = "PyGithub is a Python 3 library to use the Github API v3. \
Github resources (repositories, user profiles, organizations, \
etc.) can be managed with this."
LICENSE = "LGPL-3.0-or-later"

PV = "1.57"

RPM_NAME = "python310-PyGithub-1.57-1.3.noarch.rpm"
RPM_HASH = "c7e5fe3afcc4b69977c3357ecccbc65707f65ef5cdf9629f63f4ff2aea770c7cdf867ba950d91653cca7e61e49a1150d28abfe0c05308cdb2b1e4751fc3e9091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyGithub \
python3.10dist-pygithub \
python310-PyGithub \
python3dist-pygithub"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-PyJWT \
python310-PyNaCl \
python310-requests"

inherit rpm
