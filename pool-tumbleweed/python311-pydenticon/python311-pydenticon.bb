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

RPM_NAME = "python311-pydenticon-0.3.1-5.6.noarch.rpm"
RPM_HASH = "5f9b70dd1ae6d449446103912604af9542b79d9e7c02f7c7f2375d50ff3a04bb2d581af412595fb5638c63fe8780e7e5966acd67e54aa80eb3fa017fff8fa767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydenticon) \
python311-pydenticon \
python3dist(pydenticon)"

RDEPENDS:${PN} += "python(abi) \
python311-Pillow"

inherit rpm
