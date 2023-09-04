SUMMARY = "Binary files of mathspic"
DESCRIPTION = "Binary files of mathspic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23661"

RPM_NAME = "texlive-mathspic-bin-2023.20230311.svn23661-93.2.aarch64.rpm"
RPM_HASH = "932051e495e8a2c18db41c2320f3f2b36138ee5868230a631aefe7fc8c118fee43cb5372cd86d98c70c15cc14221d453b59e4ce78eb40d397d15337e369243f7"

RPROVIDES:${PN} += "texlive-mathspic-bin"

RDEPENDS:${PN} += "texlive-mathspic"

inherit rpm
