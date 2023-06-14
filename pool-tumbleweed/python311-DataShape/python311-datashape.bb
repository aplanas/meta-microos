SUMMARY = "A data description language"
DESCRIPTION = "DataShape is a language for describing data. It is an extension of the \
NumPy dtype with an emphasis on cross language support."
LICENSE = "BSD-2-Clause"

PV = "0.5.4"

RPM_NAME = "python311-DataShape-0.5.4-2.12.noarch.rpm"
RPM_HASH = "3252fe3a1e5f69d0ad062b92d8c90b51d61183a889b4c64a0184550cdd2ee5b8811c922bd596ee26c88e6d886acbccfd36c7b4770cac56935eb7033f2b4e1d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-datashape \
python311-DataShape \
python3dist-datashape"

RDEPENDS:${PN} += "python-abi \
python311-multipledispatch \
python311-numpy \
python311-python-dateutil"

inherit rpm
