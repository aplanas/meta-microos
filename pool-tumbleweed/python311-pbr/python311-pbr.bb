SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library to automatically do a bunch of standard \
things you want in your setup.py without you having to repeat \
them every time. It will set versions, process requirements \
files and generate AUTHORS and ChangeLog file all from git \
information."
LICENSE = "Apache-2.0"

PV = "5.11.1"

RPM_NAME = "python311-pbr-5.11.1-4.3.noarch.rpm"
RPM_HASH = "7f5149322f6ca11f28eae7404f7ccaa7299ed8520dfdaf4fd8df6c4ad9587f493382376f0391c33dd02b1d1af86969f8d8cf8819951f078f3224feffed87018c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pbr \
python3.11dist-pbr \
python311-pbr \
python3dist-pbr"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
