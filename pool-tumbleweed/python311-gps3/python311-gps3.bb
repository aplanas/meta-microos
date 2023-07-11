SUMMARY = "Python interface for gpsd"
DESCRIPTION = "Python interface for gpsd."
LICENSE = "MIT"

PV = "0.33.3+git.20171101"

RPM_NAME = "python311-gps3-0.33.3+git.20171101-1.20.noarch.rpm"
RPM_HASH = "21e78a7efa37afd590411a865e520a80b879e7a72207e14f9d2cab3d90d58ebe2690c64384bbd3a7eece3230a31fe79acbb490a4817640ae278032f793f0995a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gps3 \
python3.11dist-gps3 \
python311-gps3 \
python3dist-gps3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
