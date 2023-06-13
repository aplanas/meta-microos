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

RPM_NAME = "python311-dill-0.3.6-3.1.noarch.rpm"
RPM_HASH = "bb65cee05a8176b8938be8e78addd99971c8ef13b984d8c373700c5122909c21e52e6e5a7b1c4535dfbd847c5712013ae0acf89faeaf98b5f08d43f3725d85f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dill) \
python311-dill \
python3dist(dill)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
