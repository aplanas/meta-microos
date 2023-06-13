SUMMARY = "Create and sign CAs and certificates"
DESCRIPTION = "Create and sign CAs and certificates."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python39-certipy-0.1.3-2.11.noarch.rpm"
RPM_HASH = "aa49c7142e9ba825a4aeafdf4e92c3adbdf6e763dda098836969eec64f00f3b4633955d8ff408da38c4a445a80de8367ec6a7c273bb9d13dbc548841390bf979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certipy) \
python39-certipy \
python3dist(certipy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-pyOpenSSL \
update-alternatives"

inherit rpm
