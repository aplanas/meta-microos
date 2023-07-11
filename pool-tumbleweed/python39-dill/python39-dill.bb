SUMMARY = "Module to serialize all of Python"
DESCRIPTION = "Dill extends python's `pickle` module for serializing and de-serializing \
python objects to the majority of the built-in python types. Serialization \
is the process of converting an object to a byte stream, and the inverse \
of which is converting a byte stream back to on python object hierarchy. \
 \
Dill provides the user the same interface as the `pickle` module, and \
also includes some additional features. In addition to pickling python \
objects, `dill` provides the ability to save the state of an interpreter \
session in a single command."
LICENSE = "BSD-3-Clause"

PV = "0.3.6"

RPM_NAME = "python39-dill-0.3.6-3.3.noarch.rpm"
RPM_HASH = "08541eba322bdf1d39cf2a386660c6558f157afcc80ebe11ebfed6a460c4707840c563e8a08759d015c0865734c46aef4d0f4187716c667a4af3d2b7c9defabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dill \
python39-dill \
python3dist-dill"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
