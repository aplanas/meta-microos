SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python310-dfdatetime-0~20230225-1.2.noarch.rpm"
RPM_HASH = "45c508f99fbab255213ffa3e51d15e86eee4c0b212eecb538bea474103756c8138982a9a1266ab29d67fd78938fd0852ef58e8b5bd259a209dcaf5e98c195e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfdatetime \
python3.10dist(dfdatetime) \
python310-dfdatetime \
python3dist(dfdatetime)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
