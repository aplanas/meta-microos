SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python39-dfdatetime-0~20230225-1.4.noarch.rpm"
RPM_HASH = "45f45a7b4381b986ea92dde899d16765450a344d23e1a6e51d3e8ae8db7954d9a6c9127dc12c1fe145dcbd2e5cc9168ae9f84468b23de2f492bd4a8f46d8bfe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dfdatetime \
python39-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
