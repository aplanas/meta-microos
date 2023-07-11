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

RPM_NAME = "python310-dill-0.3.6-3.3.noarch.rpm"
RPM_HASH = "d413984d3748986eb50a0191051f6fa20aab0689a7f10d631999fa00f998a7154750284f8a597427540f83fbe9ae1d72b8f133916dfdb67c6866aafb772441de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dill \
python310-dill \
python3dist-dill"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
