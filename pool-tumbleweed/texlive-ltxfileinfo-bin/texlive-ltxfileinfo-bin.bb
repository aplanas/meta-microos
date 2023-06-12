SUMMARY = "Binary files of ltxfileinfo"
DESCRIPTION = "Binary files of ltxfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29005"

RPM_NAME = "texlive-ltxfileinfo-bin-2023.20230311.svn29005-91.1.aarch64.rpm"
RPM_HASH = "3d75d86674d96b4b0868791a5cdd2eed2c21700dbc58d5ab280a0cc54f04ba363a101df539ad921e519c67391b10f90de850c83b4b013aecd9d5904dfab4027d"

RPROVIDES:${PN} += "texlive-ltxfileinfo-bin \
texlive-ltxfileinfo-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ltxfileinfo"

inherit rpm
