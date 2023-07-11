SUMMARY = "A data description language"
DESCRIPTION = "DataShape is a language for describing data. It is an extension of the \
NumPy dtype with an emphasis on cross language support."
LICENSE = "BSD-2-Clause"

PV = "0.5.4"

RPM_NAME = "python39-DataShape-0.5.4-2.14.noarch.rpm"
RPM_HASH = "233d3670ce3e5310d2d6894add4203f706f5894a123651c6ffb58af1801fec2bd4cb8d354e1c3c87493735b4e85a618dc3e2947daa4d745da27e54eed7f6e08f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-datashape \
python39-DataShape \
python3dist-datashape"

RDEPENDS:${PN} += "python-abi \
python39-multipledispatch \
python39-numpy \
python39-python-dateutil"

inherit rpm
