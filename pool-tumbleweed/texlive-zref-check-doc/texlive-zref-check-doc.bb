SUMMARY = "Documentation for texlive-zref-check"
DESCRIPTION = "This package includes the documentation for texlive-zref-check"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.2svn63845"

RPM_NAME = "texlive-zref-check-doc-2023.209.0.0.3.2svn63845-53.1.noarch.rpm"
RPM_HASH = "e2eda361753ee10e5942fbf38d54bd2c715aac6e9ec20111e137648e09dabffd7ea9ec57394151744375af2c694d097f126b760bd33270edbe4997b6cb0ffdb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-check-doc"

RDEPENDS:${PN} += ""

inherit rpm
