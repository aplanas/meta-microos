SUMMARY = "Audio signal processing library"
DESCRIPTION = "This is a python audio signal processing library."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-zignal-0.6.0-5.4.noarch.rpm"
RPM_HASH = "19500d8d1410bcabdc7a9432c95bcd02d76d6840b0c19034cb5ce1ee70e5141f93d887ec0a7e8e2fd0dced4b72a30b4f85e0b77923a1e1ab3474b3fbfd45ed7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zignal \
python311-zignal \
python3dist-zignal"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-matplotlib \
python311-numpy \
python311-samplerate \
python311-scipy \
update-alternatives"

inherit rpm
