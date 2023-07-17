SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-pyflakes-3.0.1-5.1.noarch.rpm"
RPM_HASH = "94cb0c1f0dc02fecb31fc9e726e116228a607a3a389ac5c1724b63a6f9de8cd6a00d132f7ddb15d5464ce5340dc61757c0ea0de65e35495e1fa3223d7ead6f75"
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
