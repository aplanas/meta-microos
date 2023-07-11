SUMMARY = "Binary files of wordcount"
DESCRIPTION = "Binary files of wordcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46165"

RPM_NAME = "texlive-wordcount-bin-2023.20230311.svn46165-92.1.aarch64.rpm"
RPM_HASH = "3a4bd00060ec0e8d134c7c7d1ecaa7ee12d56f8021aab33807a0de71c1e3b9df1a03d17892f06f8227a8d4960536b630bed310ad0aef1ef0a7d575cb8e07ffc0"

RPROVIDES:${PN} += "texlive-wordcount-bin"

RDEPENDS:${PN} += "texlive-wordcount"

inherit rpm
