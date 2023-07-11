SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.9"

RPM_NAME = "python310-pydantic-1.10.9-1.1.noarch.rpm"
RPM_HASH = "6520ecf318439db1af17aa57c6fc6c87a67e5c16db65b4759ab55e9f7d79b0e0cad356561a03dfd4da9f2871cbef8d2268038c55372aab9dde9876bf547c8b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydantic \
python310-pydantic \
python3dist-pydantic"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions"

inherit rpm
