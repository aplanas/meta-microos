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

RPM_NAME = "python311-dill-0.3.6-3.3.noarch.rpm"
RPM_HASH = "c641287d3c5038423e56a9f0d94a7da5a439db4c015a99674047faeab3055e7eb3a4c9671eb444219eeea6e7cb207083586b5ca5712fcd2a1d0c714a1af9db02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dill \
python3.11dist-dill \
python311-dill \
python3dist-dill"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
