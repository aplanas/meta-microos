SUMMARY = "Python package for manipulating DXF drawings"
DESCRIPTION = "A Python package to create and modify DXF drawings, independent from the \
DXF version."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python311-ezdxf-0.16.3-1.12.aarch64.rpm"
RPM_HASH = "d07828b26835777bfc7411f2233e40dfb1d58d02c9adc93e98760c58f196ce2f08ba174349f55b41c61f65cc981aed748da514e52a760ce07b48fea6350f1c2f"

RPROVIDES:${PN} += "python3-ezdxf \
python3.11dist-ezdxf \
python311-ezdxf \
python3dist-ezdxf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyparsing \
update-alternatives"

inherit rpm
