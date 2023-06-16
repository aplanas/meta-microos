SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-pyflakes-3.0.1-4.1.noarch.rpm"
RPM_HASH = "096119aba39882074330dfd1d6688b5b8b28fb476fc0315cb8e3762baf9fcfd25e9e7a216fd1fa7e69d5fb978a3d67619997e4c511a41c4b0fc6b63d9511c15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyflakes \
python39-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
