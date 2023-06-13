SUMMARY = "Command line interface and serialization format for Blosc"
DESCRIPTION = "Command line interface and serialization format for Blosc, a \
multi-threaded, blocking and shuffling compressor. It uses \
python-blosc bindings to interface with Blosc. It also comes with native \
support for serializing and deserializing Numpy arrays."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python311-bloscpack-0.16.0-7.4.noarch.rpm"
RPM_HASH = "4e9e43832d5f1ac0718083a1c66d7a1babacd8db9c693248b9de153fcef9dea62c334790748e454132f109d3092f84e27e784d7792aad12eb1e3320e000815d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bloscpack) \
python311-bloscpack \
python3dist(bloscpack)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-blosc \
python311-numpy \
update-alternatives"

inherit rpm
