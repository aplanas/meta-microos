SUMMARY = "Binary files of latexpand"
DESCRIPTION = "Binary files of latexpand"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27025"

RPM_NAME = "texlive-latexpand-bin-2023.20230311.svn27025-93.2.aarch64.rpm"
RPM_HASH = "7621d01837dcf1ffcf153de305c9fabc425e76cded1eb6019e56ea09185de6dbe142ef848f3c38e8646b86d59e44273f6000e4ba0713929620a07ecbe29805c8"

RPROVIDES:${PN} += "texlive-latexpand-bin"

RDEPENDS:${PN} += "texlive-latexpand"

inherit rpm
