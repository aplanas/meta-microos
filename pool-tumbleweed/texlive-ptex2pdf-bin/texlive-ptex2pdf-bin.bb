SUMMARY = "Binary files of ptex2pdf"
DESCRIPTION = "Binary files of ptex2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29335"

RPM_NAME = "texlive-ptex2pdf-bin-2023.20230311.svn29335-92.1.aarch64.rpm"
RPM_HASH = "5bf6014182d12954fe722d9ff9debd2b37c435844aa2e12277623de984497d6a2faf7c690e558b1e6e49da3734db602c02b58f058ad8313893fc445a2637a13d"

RPROVIDES:${PN} += "texlive-ptex2pdf-bin"

RDEPENDS:${PN} += "texlive-ptex2pdf"

inherit rpm
