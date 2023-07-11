SUMMARY = "Binary files of lwarp"
DESCRIPTION = "Binary files of lwarp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43292"

RPM_NAME = "texlive-lwarp-bin-2023.20230311.svn43292-92.1.aarch64.rpm"
RPM_HASH = "bae6632937bdd63d3e052b180f3829874f2993a0fc390bc4b890315415b26fb8d93f62c0853b01ba1cf215949bbbdd66aa2d41d72164c39a8505da0a548a4c9b"

RPROVIDES:${PN} += "texlive-lwarp-bin"

RDEPENDS:${PN} += "texlive-lwarp"

inherit rpm
