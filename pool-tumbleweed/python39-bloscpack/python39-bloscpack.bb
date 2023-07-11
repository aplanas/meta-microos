SUMMARY = "Command line interface and serialization format for Blosc"
DESCRIPTION = "Command line interface and serialization format for Blosc, a \
multi-threaded, blocking and shuffling compressor. It uses \
python-blosc bindings to interface with Blosc. It also comes with native \
support for serializing and deserializing Numpy arrays."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python39-bloscpack-0.16.0-7.6.noarch.rpm"
RPM_HASH = "61ce7fef030190bddcbf2ddcb91e2c1796a43e1ad6c613b7defb90f6c01e692c9b4fd3a7fd7e574c377c61fc852ef0a8011bd0d4d4f2650c8c62ceb74bf73bcf"
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
