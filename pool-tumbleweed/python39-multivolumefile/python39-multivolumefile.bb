SUMMARY = "Multi volume file wrapper library"
DESCRIPTION = "A python library to provide a file-object wrapping multiple files as virtually like as \
a single file. It inherit io.RawIOBase class and support some of its standard methods."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.3"

RPM_NAME = "python39-multivolumefile-0.2.3-1.3.noarch.rpm"
RPM_HASH = "e71a750ae23b35192265d5725e1b34b2ba21927942f9c76088508c85088cb84ddb9f4a2b2ebca17856813a4960bd8bef6924df17e4f35aaa150256623dc71ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(multivolumefile) \
python39-multivolumefile \
python3dist(multivolumefile)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
