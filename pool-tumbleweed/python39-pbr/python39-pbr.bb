SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library to automatically do a bunch of standard \
things you want in your setup.py without you having to repeat \
them every time. It will set versions, process requirements \
files and generate AUTHORS and ChangeLog file all from git \
information."
LICENSE = "Apache-2.0"

PV = "5.11.1"

RPM_NAME = "python39-pbr-5.11.1-4.3.noarch.rpm"
RPM_HASH = "24d977cda7ec14e6b5914edeb9edfd000a907d8ddb1512e469866333908a0fd4b55d2a3b1375c6ad5c76f627a3ee040f7c597eb9568374342335fcd367cfd6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pbr \
python39-pbr \
python3dist-pbr"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
