SUMMARY = "Binary files of texdoc"
DESCRIPTION = "Binary files of texdoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn47948"

RPM_NAME = "texlive-texdoc-bin-2023.20230311.svn47948-93.2.aarch64.rpm"
RPM_HASH = "70d59391523125e7e6ace21d38636bc6faee8d4bc8204b785f37f91545a5ab673a32b8650fa447ccbc6f3cc2ad4b4dd4f0362a575461af0613d42e6d0e802cc9"

RPROVIDES:${PN} += "texlive-texdoc-bin"

RDEPENDS:${PN} += "texlive-texdoc"

inherit rpm
