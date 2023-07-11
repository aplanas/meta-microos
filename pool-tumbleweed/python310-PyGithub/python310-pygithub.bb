SUMMARY = "Python library to use the GitHub API v3"
DESCRIPTION = "PyGithub is a Python 3 library to use the Github API v3. \
Github resources (repositories, user profiles, organizations, \
etc.) can be managed with this."
LICENSE = "LGPL-3.0-or-later"

PV = "1.57"

RPM_NAME = "python310-PyGithub-1.57-1.5.noarch.rpm"
RPM_HASH = "3bd8d6e266f85fee02b4999e1a96088ad970b91ed7e3295f0e0608c0eae369d5bbf275736013b9bc504ace1cc9c736f0e2b3eb922736f3afd4db39ea7fb2dd2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygithub \
python310-PyGithub \
python3dist-pygithub"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-PyJWT \
python310-PyNaCl \
python310-requests"

inherit rpm
