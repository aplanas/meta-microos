SUMMARY = "Multi volume file wrapper library"
DESCRIPTION = "A python library to provide a file-object wrapping multiple files as virtually like as \
a single file. It inherit io.RawIOBase class and support some of its standard methods."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.3"

RPM_NAME = "python311-multivolumefile-0.2.3-2.1.noarch.rpm"
RPM_HASH = "03d99a31f53d229ade3e1b26f02697420300031d835ae7ec9f2b057539dda154f3869430c0228492b38a756d7bd9788456657a78b90304b24415cec49c64cd71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multivolumefile \
python3.11dist-multivolumefile \
python311-multivolumefile \
python3dist-multivolumefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
