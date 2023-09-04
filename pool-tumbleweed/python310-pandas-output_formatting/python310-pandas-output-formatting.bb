SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-output_formatting-2.0.3-1.2.noarch.rpm"
RPM_HASH = "c267dd64c865320039765b615924eb15ba3aba1556284504c46b68d62150ab78f0c6d9989ca49790b676022c926f77fc7b6252f36db0739e81db036cbd22512c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-output-formatting"

RDEPENDS:${PN} += "python310-Jinja2 \
python310-pandas \
python310-tabulate"

inherit rpm
