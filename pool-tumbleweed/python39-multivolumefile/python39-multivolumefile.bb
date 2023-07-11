SUMMARY = "Multi volume file wrapper library"
DESCRIPTION = "A python library to provide a file-object wrapping multiple files as virtually like as \
a single file. It inherit io.RawIOBase class and support some of its standard methods."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.3"

RPM_NAME = "python39-multivolumefile-0.2.3-2.1.noarch.rpm"
RPM_HASH = "f70b9ce8ffd379b43e38d7be38ec52021928858346d74a660857030c66af0ee06a9099a543616cf6068c3c734612510305a5ef509b51aa5fb55c737e029183f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-multivolumefile \
python39-multivolumefile \
python3dist-multivolumefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
