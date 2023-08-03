SUMMARY = "Documentation for texlive-dtk-bibliography"
DESCRIPTION = "This package includes the documentation for texlive-dtk-bibliography"
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_04svn65444"

RPM_NAME = "texlive-dtk-bibliography-doc-2023.209.2022_04svn65444-53.1.noarch.rpm"
RPM_HASH = "66eef71a13b132a711faa13a83fba2db2ab751785be4de1e4124a05d5d4248bdbc791cde7a5a9f9eec25c953554d607a71877d03130741b43af56eda99fe2285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtk-bibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
