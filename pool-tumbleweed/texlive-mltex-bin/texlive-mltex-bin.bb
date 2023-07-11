SUMMARY = "Binary files of mltex"
DESCRIPTION = "Binary files of mltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mltex-bin-2023.20230311.svn3006-92.1.aarch64.rpm"
RPM_HASH = "48988fbb8c38d989a15776ae15986839ba1c39e2969096761023680801a8af10c4e4cdcbbe33fb1e64cc047454a5799888d8aced3bd5b82f979eaa03d8d18b3b"

RPROVIDES:${PN} += "texlive-mltex-bin"

RDEPENDS:${PN} += "texlive-mltex"

inherit rpm
