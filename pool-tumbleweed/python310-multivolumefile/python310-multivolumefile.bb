SUMMARY = "Multi volume file wrapper library"
DESCRIPTION = "A python library to provide a file-object wrapping multiple files as virtually like as \
a single file. It inherit io.RawIOBase class and support some of its standard methods."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.3"

RPM_NAME = "python310-multivolumefile-0.2.3-2.1.noarch.rpm"
RPM_HASH = "bef17cdacd0901c91aa65e220e256201ca365761ef9b19664e0f71fec731e33959875538332d7814a5ce961f428da5920ffcdd28921dc87ea588ebf30c4595b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-multivolumefile \
python310-multivolumefile \
python3dist-multivolumefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
