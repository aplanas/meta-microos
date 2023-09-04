SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-feather-2.0.3-1.2.noarch.rpm"
RPM_HASH = "36aaa3c5bb544a79567d43498620f42d5ba3cef33118f83464333f20b33917bb526d6482c40df831d500f8abda259f7df1bbe4c2e7dfa68a03ed7c638aea6aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-feather"

RDEPENDS:${PN} += "python310-pandas \
python310-pyarrow"

inherit rpm
