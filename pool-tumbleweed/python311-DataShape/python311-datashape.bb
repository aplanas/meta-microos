SUMMARY = "A data description language"
DESCRIPTION = "DataShape is a language for describing data. It is an extension of the \
NumPy dtype with an emphasis on cross language support."
LICENSE = "BSD-2-Clause"

PV = "0.5.4"

RPM_NAME = "python311-DataShape-0.5.4-2.14.noarch.rpm"
RPM_HASH = "fbfffa16cbcd01ae84cfdb2166b796ba84b20d7467669469bdcbaac3db93fe69fb8828176b52aba021d798717f8d3848eaa5d01e2c9f92a428cbd94629341df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DataShape \
python3.11dist-datashape \
python311-DataShape \
python3dist-datashape"

RDEPENDS:${PN} += "python-abi \
python311-multipledispatch \
python311-numpy \
python311-python-dateutil"

inherit rpm
