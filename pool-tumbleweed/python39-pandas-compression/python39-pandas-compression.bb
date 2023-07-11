SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-compression-2.0.2-4.1.noarch.rpm"
RPM_HASH = "a469f0dac61a1cdba6d92447067a8486b6759421207cac386300d49df9d03fab51ab67a90c02c89d8f59d36554691a159e61666ece8a833e360c757d10757994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-compression"

RDEPENDS:${PN} += "python39-brotlipy \
python39-pandas \
python39-python-snappy \
python39-zstandard"

inherit rpm
