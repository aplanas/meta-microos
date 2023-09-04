SUMMARY = "Collect your thoughts and notes without leaving the command line"
DESCRIPTION = "Simple journal application for the command line. You can use it to \
easily create, search, and view journal entries. Journals are stored \
as human-readable plain text, and can also be encrypted using AES \
encryption."
LICENSE = "GPL-3.0-only"

PV = "4.0.1"

RPM_NAME = "jrnl-4.0.1-1.1.noarch.rpm"
RPM_HASH = "86abf97566685d1e6b90a242ba183964a99d0403327cab4ef5091b19c5cb6da3364588074ed19a7cea2664ffb7246850b7a277a7a7b0fbf04ab333f370b6616c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jrnl \
python3.11dist-jrnl \
python3dist-jrnl"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3-ansiwrap \
python3-colorama \
python3-cryptography \
python3-dateutil \
python3-keyring \
python3-parsedatetime \
python3-pyxdg \
python3-rich \
python3-ruamel.yaml \
python3-tzlocal"

inherit rpm
