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

RPM_NAME = "python39-pydenticon-0.3.1-6.3.noarch.rpm"
RPM_HASH = "6993b697aee3da3e9cee76aea4cb3e3d4da395e8f5d544a62a7fa7daa5bcda01a92f0b4f0f0422b21f0f837244d744a4c4c22486a38501dd4b01b7f6a757b337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydenticon \
python39-pydenticon \
python3dist-pydenticon"

RDEPENDS:${PN} += "python-abi \
python39-Pillow"

inherit rpm
