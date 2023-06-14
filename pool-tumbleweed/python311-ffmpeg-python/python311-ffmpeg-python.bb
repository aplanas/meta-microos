SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-ffmpeg-python-0.2.0-6.4.noarch.rpm"
RPM_HASH = "09c10035007609c2c9c7e4e6be50415591cce92d3ea83977514e4099bbe890b4b7b8b56a51a1f99a55677d626cb0f97b637fb5ea395d5efc411fc952b9528614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ffmpeg-python \
python311-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi \
python311-future"

inherit rpm
