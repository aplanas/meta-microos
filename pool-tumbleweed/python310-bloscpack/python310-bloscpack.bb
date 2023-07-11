SUMMARY = "Command line interface and serialization format for Blosc"
DESCRIPTION = "Command line interface and serialization format for Blosc, a \
multi-threaded, blocking and shuffling compressor. It uses \
python-blosc bindings to interface with Blosc. It also comes with native \
support for serializing and deserializing Numpy arrays."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python310-bloscpack-0.16.0-7.6.noarch.rpm"
RPM_HASH = "2e9e650f121b2f27d7e79828ce88f119f91b3dc8572523afe90f3c17843b12b801f0242d1e871ea4baf85231b2ba955b497b908c7de4a9903dc934c799d73c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bloscpack \
python310-bloscpack \
python3dist-bloscpack"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-blosc \
python310-numpy \
update-alternatives"

inherit rpm
