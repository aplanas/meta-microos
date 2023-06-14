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

RPM_NAME = "python39-pydenticon-0.3.1-5.6.noarch.rpm"
RPM_HASH = "d6171e2978e6a4a576c03d308bcdc776bc673cbe4075497fdbef5844cbf7eeba150b64e89e0ff98df8932516dc7f65e53923ff606c2602aa3da1db36f835bcdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydenticon \
python39-pydenticon \
python3dist-pydenticon"

RDEPENDS:${PN} += "python-abi \
python39-Pillow"

inherit rpm
