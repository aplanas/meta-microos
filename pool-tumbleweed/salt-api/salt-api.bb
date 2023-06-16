SUMMARY = "The api for Salt a parallel remote execution system"
DESCRIPTION = "salt-api is a modular interface on top of Salt that can provide a variety of entry points into a running Salt system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-api-3006.0-1.1.aarch64.rpm"
RPM_HASH = "e66858baebfce4c2aade0de150fddcae6b17fef815c6bf375e51bcb7c4d49885d1012c793f35ad3c1173f302fbf61ea988814d2a41f4e4d47f4c1638af66ee9f"

RPROVIDES:${PN} += "salt-api"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-CherryPy \
salt \
salt-master"

inherit rpm
