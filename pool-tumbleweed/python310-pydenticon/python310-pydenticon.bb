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

RPM_NAME = "python310-pydenticon-0.3.1-6.3.noarch.rpm"
RPM_HASH = "e9dda28c1ab8a600db08233038d1283c8c34570f2309d904ec4d40caf56c40106f7c9edd358423897ab5bc4d87b58ab70f12fcac624a520c1f5e3f2937ac7ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydenticon \
python310-pydenticon \
python3dist-pydenticon"

RDEPENDS:${PN} += "python-abi \
python310-Pillow"

inherit rpm
