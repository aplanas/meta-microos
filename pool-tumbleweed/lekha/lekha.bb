SUMMARY = "PDF Reader"
DESCRIPTION = "EFL and python based pdf reader."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "lekha-0.2.1-1.7.aarch64.rpm"
RPM_HASH = "3c2571d05e180bcbe6c8fb6b127203cc557bbce55ec3b36dd49ae0b5a848a75325350010eafd9ec0d9dc8d14bac8f3c6937fd7062145c7719ff254a070746290"

RPROVIDES:${PN} += "application() \
application(lekha.desktop) \
lekha \
lekha(aarch-64) \
mimehandler(application/pdf) \
python3.10dist(lekha) \
python3dist(lekha)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-PyPDF2 \
python3-efl \
python3-xdg"

inherit rpm
