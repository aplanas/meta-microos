SUMMARY = "Python API for Linstor"
DESCRIPTION = "A Python API for Linstor."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python39-linstor-1.12.0-1.7.aarch64.rpm"
RPM_HASH = "051f67191e2d6fec3435f0a50c441e0b50f76a6386b93d57afca60a8d38c47f16ce1cfc027df06eba12f3329b59097c2d084cb23d5278a3edbcb63a3817c2259"

RPROVIDES:${PN} += "python3.9dist-python-linstor \
python39-linstor \
python3dist-python-linstor"

RDEPENDS:${PN} += "python-abi \
python39-protobuf"

inherit rpm
