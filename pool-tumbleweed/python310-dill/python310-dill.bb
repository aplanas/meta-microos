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

RPM_NAME = "python310-dill-0.3.6-3.1.noarch.rpm"
RPM_HASH = "5a76dffb565a8b45c9b0bb1ad560d09aeafeef5090d95d4713044a11cd67c79c0f73742f4b9620d70ad37fe6f4b2da063762d10ce7737f69a7b8b1bcc05f2931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dill \
python3.10dist(dill) \
python310-dill \
python3dist(dill)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
