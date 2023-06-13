SUMMARY = "Python bindings for Xiphorg's Ogg Vorbis, Opus and FLAC"
DESCRIPTION = "PyOgg provides bindings for Xiph.org's OGG Vorbis, OGG Opus and FLAC \
audio file formats."
LICENSE = "BSD-3-Clause"

PV = "0.6.14a1"

RPM_NAME = "python39-PyOgg-0.6.14a1-1.4.noarch.rpm"
RPM_HASH = "f54f3cfb9fe5b1e50684989e3a2e85f1dd7a4a7657198b19265e2975bee3053f9646e85ec4d5f364199ff64d36f7323432b234ba395c714c1a9d75f0bc4fb38b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyogg) \
python39-PyOgg \
python3dist(pyogg)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
