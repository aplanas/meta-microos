SUMMARY = "Python package for manipulating DXF drawings"
DESCRIPTION = "A Python package to create and modify DXF drawings, independent from the \
DXF version."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python311-ezdxf-0.16.3-1.10.aarch64.rpm"
RPM_HASH = "56a4df3041df233e5b89d386cd2d9b9c50e17ecb4747e1dd931fce6c215fb70198c149d7f5e93509b8cda94f25a8cb5e52d7e0775b65d870e39001341e6dc794"

RPROVIDES:${PN} += "python3.11dist-ezdxf \
python311-ezdxf \
python3dist-ezdxf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyparsing \
update-alternatives"

inherit rpm
