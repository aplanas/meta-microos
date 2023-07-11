SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library to automatically do a bunch of standard \
things you want in your setup.py without you having to repeat \
them every time. It will set versions, process requirements \
files and generate AUTHORS and ChangeLog file all from git \
information."
LICENSE = "Apache-2.0"

PV = "5.11.1"

RPM_NAME = "python310-pbr-5.11.1-4.3.noarch.rpm"
RPM_HASH = "d5ce4403cd92a0e8f82885cc6f54c85f1efddf4c526b69609f01f94c95bdb6d967a68eba3514ba85b2a5c8e198c0fb54cfd312060245800ccbf238620088d44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pbr \
python310-pbr \
python3dist-pbr"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
