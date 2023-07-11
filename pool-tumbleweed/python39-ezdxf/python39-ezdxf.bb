SUMMARY = "Python package for manipulating DXF drawings"
DESCRIPTION = "A Python package to create and modify DXF drawings, independent from the \
DXF version."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python39-ezdxf-0.16.3-1.12.aarch64.rpm"
RPM_HASH = "c59111ed46e9e7a609f04b16f32a7e7e92c2757bae31435f4b46567839b17ecca76ab609ed918a52a0c09a2d14a23db850babb268c23e11f9fdd388d5bdc263f"

RPROVIDES:${PN} += "python3.9dist-ezdxf \
python39-ezdxf \
python3dist-ezdxf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pyparsing \
update-alternatives"

inherit rpm
