SUMMARY = "Python interface to libvoikko"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains a Python interface to libvoikko. This module \
can be used to perform various natural language analysis tasks on text."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "python3-libvoikko-4.3.2-1.1.noarch.rpm"
RPM_HASH = "a7e4ad0ad5b81fa60b92a10fee96d4efe6c758714852d8fb22f06c7946c3e413f803f9f3569906f1db9b6d187d22bf5f4008da613b90c17db046192dcf1194ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libvoikko"

RDEPENDS:${PN} += "libvoikko1 \
python-abi"

inherit rpm
