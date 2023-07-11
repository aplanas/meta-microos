SUMMARY = "Binary files of pfarrei"
DESCRIPTION = "Binary files of pfarrei"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29348"

RPM_NAME = "texlive-pfarrei-bin-2023.20230311.svn29348-92.1.aarch64.rpm"
RPM_HASH = "674bf7691a2af17be5b375ac32fcbbcefdafafce8ee676eb40eb7dd2a760d3d8accc9a47274f2d064b84772a701e179ebfd682f285a40d2480056b3997a2f875"

RPROVIDES:${PN} += "texlive-pfarrei-bin"

RDEPENDS:${PN} += "texlive-pfarrei"

inherit rpm
