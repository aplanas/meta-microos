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

RPM_NAME = "python39-dill-0.3.6-3.1.noarch.rpm"
RPM_HASH = "b8fd9b20636bfd76751876aa3d71636b835a53fa15d61272c1728ecc2efbb7ecbce51cf6cc770dafd3e397c77ac95fcd5f354bc1feea72b02830ae04b77c539c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dill) \
python39-dill \
python3dist(dill)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
