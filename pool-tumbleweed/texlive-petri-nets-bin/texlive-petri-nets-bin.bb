SUMMARY = "Binary files of petri-nets"
DESCRIPTION = "Binary files of petri-nets"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn39165"

RPM_NAME = "texlive-petri-nets-bin-2023.20230311.svn39165-93.1.aarch64.rpm"
RPM_HASH = "f65bc19062fc37f97ae3a17faea08938c1786da8a86ab9f72b7e05c23e8a3af58dff62e9b3c3939e48806de071477eb788bcb56f1b2071dcc6adc678b6c3157b"

RPROVIDES:${PN} += "texlive-petri-nets-bin"

RDEPENDS:${PN} += "texlive-petri-nets"

inherit rpm
