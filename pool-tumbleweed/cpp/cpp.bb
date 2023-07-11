SUMMARY = "The system GNU Preprocessor"
DESCRIPTION = "The system GNU Preprocessor."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "cpp-13-1.5.aarch64.rpm"
RPM_HASH = "f2c9ae9bb9628e719779f4366188889f7cf49335671ef7887858a250a200bfcb7fffb10f041810c01856b3cf450cf29acc045dac1cf0a21f619dcf5d8ce23968"

RPROVIDES:${PN} += "cpp"

RDEPENDS:${PN} += "/usr/bin/sh \
cpp13"

inherit rpm
