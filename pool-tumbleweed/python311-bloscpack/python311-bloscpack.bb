SUMMARY = "Command line interface and serialization format for Blosc"
DESCRIPTION = "Command line interface and serialization format for Blosc, a \
multi-threaded, blocking and shuffling compressor. It uses \
python-blosc bindings to interface with Blosc. It also comes with native \
support for serializing and deserializing Numpy arrays."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python311-bloscpack-0.16.0-7.6.noarch.rpm"
RPM_HASH = "43fdbcdcac1d84f04ce046c6ed931d3a6da3257d00b34b31bb37dd5510b949c05a2db822a54e09b14fd0636c9c326e2b1f569b17284a38064f3bfbea86983049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bloscpack \
python3.11dist-bloscpack \
python311-bloscpack \
python3dist-bloscpack"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-blosc \
python311-numpy \
update-alternatives"

inherit rpm
