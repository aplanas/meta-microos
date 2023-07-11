SUMMARY = "Read & Write Java Properties Files"
DESCRIPTION = "Read & write Java .properties files."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python310-javaproperties-0.8.1-1.3.noarch.rpm"
RPM_HASH = "c60fd4659281ebfd26a4ed445ddc1be9ee408a8c6496e02ddd337803acae2b1546eebc4e09129e8f1db576ffcd86c9d714e89a3cce7012a4e9147e532d6f8647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-javaproperties \
python310-javaproperties \
python3dist-javaproperties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
