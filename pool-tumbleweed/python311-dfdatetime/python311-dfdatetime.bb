SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python311-dfdatetime-0~20230225-1.4.noarch.rpm"
RPM_HASH = "b35a90a523840efa5db046987db8b798afe3edfa8f223f62926fa1609bf4441945854b122c6c6d2075f44b94e72968fccf8d032e7d708125cc7bbbccd2bcab3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfdatetime \
python3.11dist-dfdatetime \
python311-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
