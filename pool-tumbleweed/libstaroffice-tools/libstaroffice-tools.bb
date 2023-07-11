SUMMARY = "Tools to work with documents in StarOffice formats"
DESCRIPTION = "This package contains tools to work with documents in StarOffice file-format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-tools-0.0.7-3.10.aarch64.rpm"
RPM_HASH = "7fd0e276aacb03a602f0a060071194b58ba6f117452bef82e623f034f95dd53045664cfc293d5474c392a72388f0c2be4ce1c6b8646d3078ecd94fa38b51667c"

RPROVIDES:${PN} += "libstaroffice-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6"

inherit rpm
