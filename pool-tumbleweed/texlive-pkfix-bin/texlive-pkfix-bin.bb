SUMMARY = "Binary files of pkfix"
DESCRIPTION = "Binary files of pkfix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13364"

RPM_NAME = "texlive-pkfix-bin-2023.20230311.svn13364-93.2.aarch64.rpm"
RPM_HASH = "ef6cb1e9f0ef3237f9b8133add62308c265eaea8620c967a65e83bf6ad0b6e0234b3e8d1c1c882bb6868fd7b13b6f4cf94aa1fe68691bf3c67ceab6de15167b6"

RPROVIDES:${PN} += "texlive-pkfix-bin"

RDEPENDS:${PN} += "texlive-pkfix"

inherit rpm
