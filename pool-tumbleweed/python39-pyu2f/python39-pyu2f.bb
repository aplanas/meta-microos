SUMMARY = "U2F host library for interacting with a U2F device over USB"
DESCRIPTION = "U2F host library for interacting with a U2F device over USB."
LICENSE = "Apache-2.0"

PV = "0.1.5a"

RPM_NAME = "python39-pyu2f-0.1.5a-5.3.noarch.rpm"
RPM_HASH = "f2b0b1866fa9f87b600d9ba6228b52982fda1ba378f6e03e270bbf924ce97ed55bb715d301509ef38f096192c4f8c1b5da25115288212fd8a79b596326ee69cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyu2f \
python39-pyu2f \
python3dist-pyu2f"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
