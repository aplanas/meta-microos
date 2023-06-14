SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library to automatically do a bunch of standard \
things you want in your setup.py without you having to repeat \
them every time. It will set versions, process requirements \
files and generate AUTHORS and ChangeLog file all from git \
information."
LICENSE = "Apache-2.0"

PV = "5.11.1"

RPM_NAME = "python39-pbr-5.11.1-4.1.noarch.rpm"
RPM_HASH = "e1d3e54747bdc83c67c8fc974718d5c7a19a5e20d7ac3d1b09bec73e727ff5c3735243a3a84b4a91cbe3077e9a8591259f43c6270ddc4ecef46cc03bf4e8258d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pbr \
python39-pbr \
python3dist-pbr"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
