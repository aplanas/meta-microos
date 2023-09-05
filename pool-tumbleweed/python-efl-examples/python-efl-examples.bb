SUMMARY = "Examples of python-efl usage"
DESCRIPTION = "Some examples of usage of python-efl."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "python-efl-examples-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "148df1b7209c7f5f4f1423d7d75a9b04ae01aa8bbb56a49db0b99733fc96fad104f11ce9dfdb03bc21507243f5ea2b8252d0501320d4e081902e8d3736307dbb"

RPROVIDES:${PN} += "python-efl-examples \
python3-efl-examples"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
