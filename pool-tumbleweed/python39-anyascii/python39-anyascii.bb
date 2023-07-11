SUMMARY = "Unicode to ASCII transliteration"
DESCRIPTION = "Converts Unicode characters to their best ASCII representation."
LICENSE = "ISC"

PV = "0.3.2"

RPM_NAME = "python39-anyascii-0.3.2-1.2.noarch.rpm"
RPM_HASH = "97d9a06608cb8c117b77403a4c5782a07d4321e58a143b54e7a3e624fea8cdec321c637123b6221426b3d8e67e35aff753f366eac1f348e0a074f9510b6c75f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-anyascii \
python39-anyascii \
python3dist-anyascii"

RDEPENDS:${PN} += "python-abi"

inherit rpm
