SUMMARY = "Read & Write Java Properties Files"
DESCRIPTION = "Read & write Java .properties files."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python311-javaproperties-0.8.1-1.3.noarch.rpm"
RPM_HASH = "93065dc2a1078b0c9424d7cf0962dfe303b8704cf68c2ca0608ed165d97a5c38866374e193702952de461c19c71801a5e0f0842fd48b9f5e5f71d3b09c994522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javaproperties \
python3.11dist-javaproperties \
python311-javaproperties \
python3dist-javaproperties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
