SUMMARY = "Documentation for texlive-etextools"
DESCRIPTION = "This package includes the documentation for texlive-etextools"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415926svn20694"

RPM_NAME = "texlive-etextools-doc-2023.201.3.1415926svn20694-52.1.noarch.rpm"
RPM_HASH = "f05ff4c79f9367f30cef67776caad1a79454dbc9c696acf5f31f24c4fc51f0e857f8d28bcd22c05cd0e760ee672eb860cb9703544098c0aa842743a554508aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etextools-doc"

RDEPENDS:${PN} += ""

inherit rpm
