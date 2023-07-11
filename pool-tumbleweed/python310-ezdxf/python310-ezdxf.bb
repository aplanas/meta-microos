SUMMARY = "Python package for manipulating DXF drawings"
DESCRIPTION = "A Python package to create and modify DXF drawings, independent from the \
DXF version."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python310-ezdxf-0.16.3-1.12.aarch64.rpm"
RPM_HASH = "8a784be045745463c02c8554b516fae4bc20324b1f022d8ba4bdde344078062f3129adcf98c1a1d962483d8fd1372c7dd1bc6226797eb21a556eb0ccb8999ab5"

RPROVIDES:${PN} += "python3.10dist-ezdxf \
python310-ezdxf \
python3dist-ezdxf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pyparsing \
update-alternatives"

inherit rpm
