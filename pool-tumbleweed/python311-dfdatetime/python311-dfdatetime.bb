SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python311-dfdatetime-0~20230225-2.1.noarch.rpm"
RPM_HASH = "dfef5e27e67daca2d74aec6290bce93e0ad05c81922586ba92f1ac2bf3fb3cd63faf99bb01accf17dbfec386194479f663aff469fc426c8d7a5310c7b65c543e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfdatetime \
python3.11dist-dfdatetime \
python311-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
