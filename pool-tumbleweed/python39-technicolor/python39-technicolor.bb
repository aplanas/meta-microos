SUMMARY = "Python package for logging in colour"
DESCRIPTION = "Technicolor provides logging in colour and logging of function usage by \
means of a decorator."
LICENSE = "GPL-3.0-only"

PV = "2017.1.16.1544"

RPM_NAME = "python39-technicolor-2017.1.16.1544-3.13.noarch.rpm"
RPM_HASH = "3860e4f75421aa9645f9a6b9adbd9918038fb35e1e8c51445b7d7d9ece2b7a38e3b1da5043778295314668b0aca683980acae19aa28dff79c0a77e5230b3a4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-technicolor \
python39-technicolor \
python3dist-technicolor"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
