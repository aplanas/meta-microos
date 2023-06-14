SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-pyflakes-3.0.1-4.1.noarch.rpm"
RPM_HASH = "738b5e699edca8db151fafe05b8fb6a91dd3a3abd2e8d64b8307aa319cbeed87d7cb2c9cbd5fa214af91305452587b0333359848f86dff193b067ad6e3288423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyflakes \
python311-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
