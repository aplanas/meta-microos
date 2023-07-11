SUMMARY = "Python library to use the GitHub API v3"
DESCRIPTION = "PyGithub is a Python 3 library to use the Github API v3. \
Github resources (repositories, user profiles, organizations, \
etc.) can be managed with this."
LICENSE = "LGPL-3.0-or-later"

PV = "1.57"

RPM_NAME = "python39-PyGithub-1.57-1.5.noarch.rpm"
RPM_HASH = "24d3e1a90079257aa9687f80a0509aa9a53fc57998cba6cc7cea8a4cd0eb35576d45328678000283b22ab7e2c0444d28fa4571d21f2c17fbc46b05739cd8054e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygithub \
python39-PyGithub \
python3dist-pygithub"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-PyJWT \
python39-PyNaCl \
python39-requests"

inherit rpm
