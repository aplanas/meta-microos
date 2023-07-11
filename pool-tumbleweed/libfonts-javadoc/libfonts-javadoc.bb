SUMMARY = "Javadoc for libfonts"
DESCRIPTION = "Javadoc for libfonts."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libfonts-javadoc-1.1.6-1.5.noarch.rpm"
RPM_HASH = "81ca998625df919c02c14299c82f393efe4b539e0d9cf16a5779638783cdecfce84e8fc8205dd45e79ec2a657b79bcaa4ce56a4b13b32688d790f593039a34c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfonts-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
