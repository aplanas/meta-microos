SUMMARY = "Python bindings for Xiphorg's Ogg Vorbis, Opus and FLAC"
DESCRIPTION = "PyOgg provides bindings for Xiph.org's OGG Vorbis, OGG Opus and FLAC \
audio file formats."
LICENSE = "BSD-3-Clause"

PV = "0.6.14a1"

RPM_NAME = "python311-PyOgg-0.6.14a1-1.5.noarch.rpm"
RPM_HASH = "22aa1de877788561989b144d233e81dfdda16cc5d68a4e4ec271d3e7c3f40b832a30f0375b99850c5d829e084e15e7402c57de1d0eabb4dcd06af7631595bc96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOgg \
python3.11dist-pyogg \
python311-PyOgg \
python3dist-pyogg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
