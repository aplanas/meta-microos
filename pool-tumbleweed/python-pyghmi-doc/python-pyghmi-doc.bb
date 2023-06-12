SUMMARY = "General Hardware Management Initiative (IPMI and others) -- Documentation"
DESCRIPTION = "This is a pure python implementation of IPMI protocol. \
 \
pyghmicons and pyghmiutil are example scripts to show how one may incorporate \
this library into python code"
LICENSE = "Apache-2.0"

PV = "1.5.29"

RPM_NAME = "python-pyghmi-doc-1.5.29-1.3.noarch.rpm"
RPM_HASH = "8ad80f1ffab27d5a972f80821517f9dec6200c53d56411981b1e6a6ae5b5fbffa5a982059b6e8b58873df3365f4a4227ef239c5df727b9d79a97b1d797af527f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyghmi-doc"
RDEPENDS:${PN} += ""

inherit rpm
