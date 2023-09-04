SUMMARY = "Documentation for texlive-yannisgr"
DESCRIPTION = "This package includes the documentation for texlive-yannisgr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22613"

RPM_NAME = "texlive-yannisgr-doc-2023.209.svn22613-53.2.noarch.rpm"
RPM_HASH = "f65b5f2271748294161abb0668df18cb2ddc21b2512a9c9ae27100dc41d7e968ad498adafbfcfc9daa0260e15aeb64251e2fe5c56efedfcc67362659db951a7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yannisgr-doc"

RDEPENDS:${PN} += ""

inherit rpm
