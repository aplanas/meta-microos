SUMMARY = "Plugin integrating isort in flake8"
DESCRIPTION = "Use `isort`_ to check if the imports on your python files are sorted the way you expect."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "python39-flake8-isort-6.0.0-1.6.noarch.rpm"
RPM_HASH = "15cf5897df9b099a2a0406ca0387fc15dce083287bfad5e0e863dba86082db1f38a22527b72634749d3b6bb3db166876f1847490c50e2d331bf4e70592671d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-isort \
python39-flake8-isort \
python3dist-flake8-isort"

RDEPENDS:${PN} += "python-abi \
python39-flake8 \
python39-isort \
python39-testfixtures"

inherit rpm
