SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python311-dfdatetime-0~20230225-1.2.noarch.rpm"
RPM_HASH = "1fa0712a3fecede35a64715eb11bf3c1e9a8a5f9e9deeddf61bf7ee654f6f830c36af1ee41de4e135064a86cf7b0f92ed517b42bfcc99e58edce9335eaa7c86b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dfdatetime \
python311-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
