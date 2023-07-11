SUMMARY = "Advanced Python dictionaries with dot notation access"
DESCRIPTION = "Advanced Python dictionaries with dot notation access"
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python310-python-box-6.1.0-1.5.noarch.rpm"
RPM_HASH = "94f2e80ea8d0714239358b5c61ce4358e858d9502a60b83e2a2a03e35960b556dc28bdde55adb863c0d2cb26339abed5c3d083b6a6bf8cc7bd71501b82ce805f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-box \
python310-python-box \
python3dist-python-box"

RDEPENDS:${PN} += "python-abi \
python310-msgpack \
python310-ruamel.yaml \
python310-toml"

inherit rpm
