SUMMARY = "Binary files of optexcount"
DESCRIPTION = "Binary files of optexcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn59817"

RPM_NAME = "texlive-optexcount-bin-2023.20230311.svn59817-91.1.aarch64.rpm"
RPM_HASH = "13a075d92d81fa9bdd8117430bfbc41375d144b5b40b676524eaa02b9c24393d97cde705f67fc9a8d3a9ace62018ef651cd35665a5259a9fbff672c8593d02f5"

RPROVIDES:${PN} += "texlive-optexcount-bin"

RDEPENDS:${PN} += "texlive-optexcount"

inherit rpm
