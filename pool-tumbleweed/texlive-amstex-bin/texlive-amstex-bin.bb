SUMMARY = "Binary files of amstex"
DESCRIPTION = "Binary files of amstex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-amstex-bin-2023.20230311.svn3006-92.1.aarch64.rpm"
RPM_HASH = "6fca721d4a19055e4f188740e85621af40ee6f11ab23947a73ed71f58b2e88ba16bc49a1e4ad9256cd47faa8efdb805e1ce1d156916ca435fbd0abbe15cccc0f"

RPROVIDES:${PN} += "texlive-amstex-bin"

RDEPENDS:${PN} += "texlive-amstex"

inherit rpm
