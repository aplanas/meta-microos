SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python310-dfdatetime-0~20230225-1.4.noarch.rpm"
RPM_HASH = "efe76da4d194fcde881fa7aa6c394e2620e5fac0853af9052e58c5561aa788fc6de9bfc9dc6e68dc3c1e9e0bfcc08263bf23a296b3b8051812f1b8e5e07edf46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dfdatetime \
python310-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
