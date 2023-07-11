SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-ffmpeg-python-0.2.0-6.6.noarch.rpm"
RPM_HASH = "b2a37d5ae9c7400c7bf4d1ee242ef0dfb96d01462d2da9e76eb629b78e3cc0b916ae608b6cca59cd594d9768d0b832839dc49f684f37f6561f841b9fedaec167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ffmpeg-python \
python310-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi \
python310-future"

inherit rpm
