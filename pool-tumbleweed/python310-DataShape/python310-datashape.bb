SUMMARY = "A data description language"
DESCRIPTION = "DataShape is a language for describing data. It is an extension of the \
NumPy dtype with an emphasis on cross language support."
LICENSE = "BSD-2-Clause"

PV = "0.5.4"

RPM_NAME = "python310-DataShape-0.5.4-2.14.noarch.rpm"
RPM_HASH = "a5697db252cf86f03544fb1ae20f85b8cb5346a760e167b46d03105f4d9e828d0c3ca790fa4827346220cfb8156c30558d73f240eef6c34a071c5d8a31c8e557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-datashape \
python310-DataShape \
python3dist-datashape"

RDEPENDS:${PN} += "python-abi \
python310-multipledispatch \
python310-numpy \
python310-python-dateutil"

inherit rpm
