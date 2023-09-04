SUMMARY = "Documentation for texlive-hindmadurai"
DESCRIPTION = "This package includes the documentation for texlive-hindmadurai"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57360"

RPM_NAME = "texlive-hindmadurai-doc-2023.209.0.0.0.1svn57360-54.2.noarch.rpm"
RPM_HASH = "a46faf0bf51e5d5ced2f16533362e09fbaa75836ca8dbf0000f2723775225c166e1fe5d43c0bc26f4f3fd82e1cb76335692f272c2ef42b1d476681aa40c5ebef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hindmadurai-doc"

RDEPENDS:${PN} += ""

inherit rpm
