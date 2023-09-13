SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-ffmpeg-python-0.2.0-7.1.noarch.rpm"
RPM_HASH = "870e5c7aa21bcefcec4480a66bf18b711915b057e6e1674ac742a22a526015e2056081407dca878ac332241e2ab622c9e35262dd6979b15055bf5931f4882719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ffmpeg-python \
python39-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
