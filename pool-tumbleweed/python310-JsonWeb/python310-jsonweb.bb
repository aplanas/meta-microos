SUMMARY = "Add JSON (de)serialization to your python objects"
DESCRIPTION = "Quickly add json serialization and deserialization \
to your python classes."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "python310-JsonWeb-0.8.2-6.3.noarch.rpm"
RPM_HASH = "2af3657c7b4e856205acd34caeabf5c8aec4f07f87e5d7703a802861308e3fe824e97fde2f0b2f16a550ed0f3ba713606703adb725a581a350858111f9faf2d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonweb \
python310-JsonWeb \
python3dist-jsonweb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
