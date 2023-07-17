SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-pyflakes-3.0.1-5.1.noarch.rpm"
RPM_HASH = "a2e9036590124bd7fd2e08d4f98ca44ac441574a00d7b194a36c067f5ca650286960fa5d49e04039518091ba12dfaed79df51e31506c01e5d66f40cb9728c02e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyflakes \
python3.11dist-pyflakes \
python311-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
