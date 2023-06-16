SUMMARY = "Command line interface and serialization format for Blosc"
DESCRIPTION = "Command line interface and serialization format for Blosc, a \
multi-threaded, blocking and shuffling compressor. It uses \
python-blosc bindings to interface with Blosc. It also comes with native \
support for serializing and deserializing Numpy arrays."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python39-bloscpack-0.16.0-7.4.noarch.rpm"
RPM_HASH = "e8a832faa9900a8fb40a3a1e727d39e06f2e28eddec7140387a789d37a9ed069d15ef695a453de60c57f4e1e4285392200be25d531231a3ac13e07399902e186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bloscpack \
python39-bloscpack \
python3dist-bloscpack"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-blosc \
python39-numpy \
update-alternatives"

inherit rpm
