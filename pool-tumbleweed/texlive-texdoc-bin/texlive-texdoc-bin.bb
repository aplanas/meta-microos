SUMMARY = "Binary files of texdoc"
DESCRIPTION = "Binary files of texdoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn47948"

RPM_NAME = "texlive-texdoc-bin-2023.20230311.svn47948-93.1.aarch64.rpm"
RPM_HASH = "3e874d826c72bb69a06bfc93c58a3888534d0654df9592e5694a659ab9fb0e712f9698f2e283450a666fdf77dc02ee03532866d26e9fe6f53cf5e40aa6793928"

RPROVIDES:${PN} += "texlive-texdoc-bin"

RDEPENDS:${PN} += "texlive-texdoc"

inherit rpm
