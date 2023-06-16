SUMMARY = "Enhanced Python builtin doctest module"
DESCRIPTION = "A rewrite of the builtin doctest module with a pytest plugin."
LICENSE = "Apache-2.0"

PV = "0.15.10"

RPM_NAME = "python310-xdoctest-0.15.10-1.11.noarch.rpm"
RPM_HASH = "fed02b1d3d98c76d1244d6246f029c0fedf5d1d73419dac7a10021df6f4cf7c3d96a37bf4bd82e79d2b12e249a80fe6c0c19c1620c228130399ac20c627b3426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xdoctest \
python3.10dist-xdoctest \
python310-xdoctest \
python3dist-xdoctest"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
