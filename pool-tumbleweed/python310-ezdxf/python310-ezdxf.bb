SUMMARY = "Python package for manipulating DXF drawings"
DESCRIPTION = "A Python package to create and modify DXF drawings, independent from the \
DXF version."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python310-ezdxf-0.16.3-1.10.aarch64.rpm"
RPM_HASH = "9eac95c9c3d985c0a73f0d3224877da838e4a122cc30c5f43083268b373fba701ddf0132c5945044cbcca21bc8cbbab3294dd2044d570325b03b49064d923859"

RPROVIDES:${PN} += "python3-ezdxf \
python3.10dist-ezdxf \
python310-ezdxf \
python3dist-ezdxf"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-pyparsing \
update-alternatives"

inherit rpm
