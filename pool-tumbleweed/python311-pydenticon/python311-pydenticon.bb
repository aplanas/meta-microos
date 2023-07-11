SUMMARY = "Library for generating identicons"
DESCRIPTION = "Pydenticon is a small utility library that can be used for deterministically \
generating identicons based on the hash of provided data. \
 \
The implementation is a port of the Sigil identicon implementation from: \
 \
* https://github.com/cupcake/sigil/ \
 \
Pydenticon provides a couple of extensions of its own when compared to the \
original Sigil implementation, like: \
 \
* Ability to supply custom digest algorithms (allowing for larger identicons if \
  digest provides enough entropy). \
* Ability to specify a rectangle for identicon size.."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "python311-pydenticon-0.3.1-6.3.noarch.rpm"
RPM_HASH = "95ea8c09fc25f82e505134b909e3fa146cb230c9d99ab2d79676ea5c4ea74c8e7c69230a413e3a65fca5a0141827359d0582339a906be7ef9a9d2b81114cb1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydenticon \
python3.11dist-pydenticon \
python311-pydenticon \
python3dist-pydenticon"

RDEPENDS:${PN} += "python-abi \
python311-Pillow"

inherit rpm
