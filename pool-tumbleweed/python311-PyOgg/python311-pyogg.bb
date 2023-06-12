SUMMARY = "Python bindings for Xiphorg's Ogg Vorbis, Opus and FLAC"
DESCRIPTION = "PyOgg provides bindings for Xiph.org's OGG Vorbis, OGG Opus and FLAC \
audio file formats."
LICENSE = "BSD-3-Clause"

PV = "0.6.14a1"

RPM_NAME = "python311-PyOgg-0.6.14a1-1.4.noarch.rpm"
RPM_HASH = "c62e024fab076600bf95844caeb6ba63e03a98626675945b53b0a13f8ac5a7ff52c8782708bc879e0d0c5d5cc0cbf305387f02a42fc68a1faa4f3d8887fa8ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyogg) \
python311-PyOgg \
python3dist(pyogg)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
