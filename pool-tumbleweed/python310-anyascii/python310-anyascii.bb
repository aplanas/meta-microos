SUMMARY = "Unicode to ASCII transliteration"
DESCRIPTION = "Converts Unicode characters to their best ASCII representation."
LICENSE = "ISC"

PV = "0.3.2"

RPM_NAME = "python310-anyascii-0.3.2-1.1.noarch.rpm"
RPM_HASH = "3a39058d1222d2739430f407b861f8d84dcd31b5256c52ad72e0ec2a207f9045720d30eba3040c018b0266f473f338bd4aaf6b9c682dc30405158730e5e9edcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyascii \
python3.10dist-anyascii \
python310-anyascii \
python3dist-anyascii"

RDEPENDS:${PN} += "python-abi"

inherit rpm
