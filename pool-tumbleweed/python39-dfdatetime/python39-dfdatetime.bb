SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python39-dfdatetime-0~20230225-2.1.noarch.rpm"
RPM_HASH = "fc88ff9bb8a0d3e8610990afcbd9c91b39549b001c13a20a49ff91a8a9c30087642b15bef28be520678be557818610bdad691604142f9e4da48d42bb8c9e9d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dfdatetime \
python39-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
