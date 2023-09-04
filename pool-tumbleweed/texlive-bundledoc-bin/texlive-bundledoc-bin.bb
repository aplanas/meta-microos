SUMMARY = "Binary files of bundledoc"
DESCRIPTION = "Binary files of bundledoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17794"

RPM_NAME = "texlive-bundledoc-bin-2023.20230311.svn17794-93.2.aarch64.rpm"
RPM_HASH = "e7ba9bf1caf5c229313f202fd20c82d4d2a9bcb4ae4da78895f0790b593964472cf0035b272b0bed87732181c43f745c9a36428190671397098b64ecad4cf0fc"

RPROVIDES:${PN} += "texlive-bundledoc-bin"

RDEPENDS:${PN} += "texlive-bundledoc"

inherit rpm
