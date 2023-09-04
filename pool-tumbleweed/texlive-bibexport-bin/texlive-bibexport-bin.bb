SUMMARY = "Binary files of bibexport"
DESCRIPTION = "Binary files of bibexport"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16219"

RPM_NAME = "texlive-bibexport-bin-2023.20230311.svn16219-93.2.aarch64.rpm"
RPM_HASH = "f2926f979b5edbd9d1cd4ef7f9034c9d07e408aa406496f3f2cc0a13549cb794ecf3979d03223d7318df3517a44c20c4c07b66b7f23a3afe116ad7bf7fc48b21"

RPROVIDES:${PN} += "texlive-bibexport-bin"

RDEPENDS:${PN} += "texlive-bibexport"

inherit rpm
