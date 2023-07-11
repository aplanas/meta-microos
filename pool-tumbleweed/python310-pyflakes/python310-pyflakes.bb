SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-pyflakes-3.0.1-4.3.noarch.rpm"
RPM_HASH = "acb234a68ea532ae093f861c7ca0d433583ff17a65f4e4481d43df60e2c0116dec1cdc735637503db5bb22926479e74493e69c42ae59cf2585c0328c08eff2b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyflakes \
python310-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
