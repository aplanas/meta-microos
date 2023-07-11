SUMMARY = "File identification library for Python"
DESCRIPTION = "File identification library for Python, including license file SPDX identifier."
LICENSE = "MIT"

PV = "2.2.13"

RPM_NAME = "python311-identify-2.2.13-1.11.noarch.rpm"
RPM_HASH = "df005679820afbae22d75d9bdf1f1d7a23475ab51e1a45c84a7a29ab24e959bc0b4040fa8c1937644b6d05e41e7a6628be7ededac20d7742840d523522651e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-identify \
python3.11dist-identify \
python311-identify \
python3dist-identify"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
