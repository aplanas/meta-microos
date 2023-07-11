SUMMARY = "Python module for converting a dictionary to XML"
DESCRIPTION = "This module converts a Python dictionary or other native data type \
into a valid XML string."
LICENSE = "GPL-2.0-only"

PV = "1.7.16"

RPM_NAME = "python39-dicttoxml-1.7.16-1.4.noarch.rpm"
RPM_HASH = "626a707ac8c3e75bffc8c57ed67cab14c6f03efc472ba60c69df11a0f2051b4f9c7a8282b6ec4fefae42f4bbf6bfd1f630099bb0aeb268a30ef17eafbf765226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dicttoxml \
python39-dicttoxml \
python3dist-dicttoxml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
