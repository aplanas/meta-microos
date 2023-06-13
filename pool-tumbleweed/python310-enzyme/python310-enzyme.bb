SUMMARY = "Python video metadata parser"
DESCRIPTION = "Enzyme is a Python module to parse video metadata."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python310-enzyme-0.4.1-4.13.noarch.rpm"
RPM_HASH = "443a2728ace666ab3ab7f082f856673e50857b185a3696200dbf019478887302f5c8030da9fe12f707cccd354241c9fdf23f6dc3d0660e704f38dafa9d71abfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enzyme \
python3.10dist(enzyme) \
python310-enzyme \
python3dist(enzyme)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
