SUMMARY = "Scripts and data for building API documentation"
DESCRIPTION = "The kapidox framework enables the generation of API documentation from \
Doxygen-formatted codde comments in a standard format and style."
LICENSE = "BSD-2-Clause"

PV = "5.109.0"

RPM_NAME = "kapidox-5.109.0-1.1.noarch.rpm"
RPM_HASH = "8b5e1e2372c91ee33540950047a5d392665040a58d2dcf01442de6eed6eec4a40efe43b6ce2d10280f760ffeb41e9b042eafc8e95938f526d800db4584b0c292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapidox \
python3.11dist-kapidox \
python3dist-kapidox"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
doxygen \
graphviz \
graphviz-gd \
libqt5-qttools \
python-abi \
python3-Jinja2 \
python3-xml"

inherit rpm
