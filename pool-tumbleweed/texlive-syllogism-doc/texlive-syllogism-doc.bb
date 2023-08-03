SUMMARY = "Documentation for texlive-syllogism"
DESCRIPTION = "This package includes the documentation for texlive-syllogism"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-syllogism-doc-2023.209.1.2svn15878-58.1.noarch.rpm"
RPM_HASH = "7de7d9071069200fe6ac6c2650d153b69a8fd98ab030fe267c6709ad9f3c87d066239e529c7c55d54cd4458865df71331b970673d42ed262399981df9a44dc26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syllogism-doc"

RDEPENDS:${PN} += ""

inherit rpm
