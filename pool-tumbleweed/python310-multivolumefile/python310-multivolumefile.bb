SUMMARY = "Multi volume file wrapper library"
DESCRIPTION = "A python library to provide a file-object wrapping multiple files as virtually like as \
a single file. It inherit io.RawIOBase class and support some of its standard methods."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.3"

RPM_NAME = "python310-multivolumefile-0.2.3-1.3.noarch.rpm"
RPM_HASH = "5134142d25ae1138157d40941ef4b437a4ee82dc84a74e12db5c274ca897a754c20ca0e110cc5e82a7aaba140e1efbee4a6641c461b73ee4252e42116bef3df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multivolumefile \
python3.10dist(multivolumefile) \
python310-multivolumefile \
python3dist(multivolumefile)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
