SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-pyflakes-3.0.1-4.3.noarch.rpm"
RPM_HASH = "b279a5bff691c1c90da1ca368b69321d4ef636d5a6d7321c1ec8167c927fe225d3827a8f65d02a2e58372436e02ffa5deb228a99cee8c9015cbec7f2a0ba7d27"
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
