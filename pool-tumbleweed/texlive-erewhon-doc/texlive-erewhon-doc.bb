SUMMARY = "Documentation for texlive-erewhon"
DESCRIPTION = "This package includes the documentation for texlive-erewhon"
LICENSE = "OFL-1.1"

PV = "2023.201.1.12svn63312"

RPM_NAME = "texlive-erewhon-doc-2023.201.1.12svn63312-53.1.noarch.rpm"
RPM_HASH = "925f06d01eafcd49bbe24f3adc6aa2b9bf48af268c08860c9db7eb81d55491fb22b7a98a00a21c4bc1744960cc8af68fa45cefd22045b4914bd7ad3d66590855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-doc"
RDEPENDS:${PN} += ""

inherit rpm
