SUMMARY = "Python bindings for Xiphorg's Ogg Vorbis, Opus and FLAC"
DESCRIPTION = "PyOgg provides bindings for Xiph.org's OGG Vorbis, OGG Opus and FLAC \
audio file formats."
LICENSE = "BSD-3-Clause"

PV = "0.6.14a1"

RPM_NAME = "python310-PyOgg-0.6.14a1-1.5.noarch.rpm"
RPM_HASH = "d6c1bbe75f43745f96937af06d924050b1a7aaf34f1dccb818c0080241bd094064ecb5f1822be6212c626349a4739bae97e12b0488bdbbdf65b119138ba1afef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyogg \
python310-PyOgg \
python3dist-pyogg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
