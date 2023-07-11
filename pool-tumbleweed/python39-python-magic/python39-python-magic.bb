SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python39-python-magic-0.4.27-4.3.noarch.rpm"
RPM_HASH = "bb95b98482765f3f0e365786e1068e6d00d5c6676d804cdca56d3ce18dbe09d9a9115dbd8d3079701040f2c38b97f84f672e87083db703268acc40dc1110ab7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-magic \
python39-python-magic \
python3dist-python-magic"

RDEPENDS:${PN} += "file \
python-abi"

inherit rpm
