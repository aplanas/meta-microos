SUMMARY = "Python package for logging in colour"
DESCRIPTION = "Technicolor provides logging in colour and logging of function usage by \
means of a decorator."
LICENSE = "GPL-3.0-only"

PV = "2017.1.16.1544"

RPM_NAME = "python310-technicolor-2017.1.16.1544-3.13.noarch.rpm"
RPM_HASH = "a840b8f1c0cff12e880a7855cd45be4ba2104e4482cd57a6155a0c1f6c648afd787245dfe81bf2bfb61ae6d66246e7234e1c6c760240a8d9cd03055c4a5b5dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-technicolor \
python3.10dist-technicolor \
python310-technicolor \
python3dist-technicolor"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
