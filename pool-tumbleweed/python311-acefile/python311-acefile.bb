SUMMARY = "ACE 1.0 and 2.0 archive reader/extractor in pure Python"
DESCRIPTION = "Read/test/extract ACE 1.0 and 2.0 archives in pure python."
LICENSE = "BSD-2-Clause"

PV = "0.6.12"

RPM_NAME = "python311-acefile-0.6.12-3.18.aarch64.rpm"
RPM_HASH = "57c9e28d2772344aae9dd56de22bd150d62b676df69f53e75027ddda73aa36db965278ca7bde224b135093395b3cad041895861ed2aa1971e8259c4849cf3213"

RPROVIDES:${PN} += "python3-acefile \
python3.11dist-acefile \
python311-acefile \
python3dist-acefile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
